import java.util.*;

class Router {

    static class Packet {
        final int source;
        final int destination;
        final int timestamp;

        public Packet(int source, int destination, int timestamp) {
            this.source = source;
            this.destination = destination;
            this.timestamp = timestamp;
        }

        public int[] toIntArray() {
            return new int[]{source, destination, timestamp};
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Packet)) return false;
            Packet p = (Packet) o;
            return source == p.source &&
                   destination == p.destination &&
                   timestamp == p.timestamp;
        }

        @Override
        public int hashCode() {
            return Objects.hash(source, destination, timestamp);
        }
    }

    private final Queue<Packet> packets;        
    private final Set<Packet> packetSet;                  
    private final Map<Integer, List<Packet>> packetsByDest;   
    private final int memoryLimit;

    public Router(int memoryLimit) {
        this.memoryLimit = memoryLimit;
        this.packets = new ArrayDeque<>(memoryLimit);
        this.packetSet = new HashSet<>(memoryLimit);
        this.packetsByDest = new HashMap<>();
    }

    public boolean addPacket(int source, int destination, int timestamp) {
        Packet newPacket = new Packet(source, destination, timestamp);

        if (!packetSet.add(newPacket)) {
            return false;
        }

        if (packets.size() == memoryLimit) {
            Packet oldest = packets.poll();
            if (oldest != null) {
                packetSet.remove(oldest);
                removeFromIndex(oldest);
            }
        }

        packets.add(newPacket);
        addToIndex(newPacket);

        return true;
    }

    public int[] forwardPacket() {
        Packet packet = packets.poll();
        if (packet == null) return new int[0];

        packetSet.remove(packet);
        removeFromIndex(packet);
        return packet.toIntArray();
    }

    // getting the count with binary search
    public int getCount(int destination, int startTime, int endTime) {
        List<Packet> list = packetsByDest.get(destination);
        if (list == null || list.isEmpty()) return 0;

        // Lower Bound
        int startIndex = lowerBound(list, startTime);
        if (startIndex == list.size()) return 0;

        // Upper Bound
        int endIndex = upperBound(list, endTime);

        return Math.max(0, endIndex - startIndex);
    }

    // add sorted with binary search
    private void addToIndex(Packet packet) {
        List<Packet> list = packetsByDest.computeIfAbsent(packet.destination, k -> new ArrayList<>());

        int pos = Collections.binarySearch(list, packet, Comparator.comparingInt(p -> p.timestamp));
        if (pos < 0) pos = -pos - 1; 
        list.add(pos, packet);
    }

    private void removeFromIndex(Packet packet) {
        List<Packet> list = packetsByDest.get(packet.destination);
        if (list != null) {
            int pos = Collections.binarySearch(list, packet, Comparator.comparingInt(p -> p.timestamp));
            if (pos >= 0) {
                list.remove(pos); 
            }
            if (list.isEmpty()) {
                packetsByDest.remove(packet.destination);
            }
        }
    }

    private int lowerBound(List<Packet> list, int time) {
        int left = 0, right = list.size();
        while (left < right) {
            int mid = (left + right) >>> 1;
            if (list.get(mid).timestamp < time) left = mid + 1;
            else right = mid;
        }
        return left;
    }

    private int upperBound(List<Packet> list, int time) {
        int left = 0, right = list.size();
        while (left < right) {
            int mid = (left + right) >>> 1;
            if (list.get(mid).timestamp <= time) left = mid + 1;
            else right = mid;
        }
        return left;
    }
}


/**
 * Your Router object will be instantiated and called as such:
 * Router obj = new Router(memoryLimit);
 * boolean param_1 = obj.addPacket(source,destination,timestamp);
 * int[] param_2 = obj.forwardPacket();
 * int param_3 = obj.getCount(destination,startTime,endTime);
 */
