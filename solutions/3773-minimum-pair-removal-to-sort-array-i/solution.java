class Solution {
    public int minimumPairRemoval(int[] nums) {
        if (nums.length == 1) return 0;
    
        int[] ordered = nums.clone();
        //System.out.println(Arrays.toString(nums));

        Arrays.sort(ordered);
        //System.out.println(Arrays.toString(ordered));
        if (Arrays.equals(ordered, nums)) return 0;

        int min = 99999999;
        int min_i = -1;
        int min_j = -1;
        int n = nums.length;
        for(int i = 0; i < n - 1; i++){
            if(nums[i] + nums[i+1] < min) {
                min = nums[i] + nums[i+1];
                min_i = i;
                min_j = i+1;
            }
        }

        int[] newArray = new int[n - 1];
        System.arraycopy(nums, 0, newArray, 0, min_i);
        newArray[min_i] = min;
        System.arraycopy(nums, min_j + 1, newArray, min_j, n - min_j - 1);
        return 1 + minimumPairRemoval(newArray);
    }
}
