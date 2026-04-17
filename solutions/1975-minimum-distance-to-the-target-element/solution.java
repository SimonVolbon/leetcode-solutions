class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int n = nums.length;
        int shortestDistance = 1001;
        for(int i = 0; i < n; i++) {
            if(nums[i] == target) {
                int distance = Math.abs(i - start);
                if(shortestDistance > distance)
                {
                    shortestDistance = distance;
                }
            }
        }

        return shortestDistance;
    }
}
