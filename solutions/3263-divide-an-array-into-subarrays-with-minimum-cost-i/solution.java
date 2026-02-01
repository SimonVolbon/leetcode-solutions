class Solution {
    public int minimumCost(int[] nums) {
        int res = nums[0];
        int[] newArr = Arrays.copyOfRange(nums, 1, nums.length);
        Arrays.sort(newArr);
        return res + newArr[0] + newArr[1];
    }
}
