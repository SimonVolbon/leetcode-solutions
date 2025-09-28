class Solution {
    public int largestPerimeter(int[] nums) {
        //int[] ans = new int[3];
        Arrays.sort(nums);
        for(int i = nums.length - 1; i >= 2; i--){
            int a = nums[i];
            int b = nums[i - 1];
            int c = nums[i - 2];
            if((a + b > c) && (a + c > b) && (b + c > a)) {
                return (a + b + c);
            }
        }
        return 0;
    }
}
