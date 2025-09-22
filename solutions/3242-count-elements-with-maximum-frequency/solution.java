class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();

        int currMaxFrequency = 0;

        for(int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            if(countMap.get(num) > currMaxFrequency)
            {
                currMaxFrequency = countMap.get(num);
            }
        }

        final int maxFrequency = currMaxFrequency;
        int count = countMap.values()
                            .stream()
                            .filter(value -> value == maxFrequency)
                            .collect(Collectors.summingInt(Integer::intValue));
        
        return count;
    }
}
