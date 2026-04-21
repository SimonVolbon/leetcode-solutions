class Solution {
    public int minimumDistance(int[] nums) {
    Map<Integer, List<Integer>> count = new HashMap<>();
    for (int i = 0; i < nums.length; i++)
        count.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);

    int min_dist = Integer.MAX_VALUE;
    for (List<Integer> value : count.values()) {
        for (int i = 0; i + 2 < value.size(); i++) {
            int first = value.get(i), sec = value.get(i+1), third = value.get(i+2);
            min_dist = Math.min(min_dist, 2 * (third - first));
        }
    }
        return min_dist == Integer.MAX_VALUE ? -1 : min_dist;
    }
}
