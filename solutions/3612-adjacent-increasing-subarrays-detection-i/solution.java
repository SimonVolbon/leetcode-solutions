class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {

        if(nums.size() < 2 * k) return false;
        System.out.println("here");
        for(int i = 0; i < nums.size() - 2 * k + 1; i++) {
        
            List<Integer> a = nums.subList(i, i+k);
            List<Integer> b = nums.subList(i+k, i+2*k);
            System.out.println(a.toString() + "+" + b.toString());
            if(isIncreasing(a) && isIncreasing(b)) return true;
        }

        return false;
    }

    public boolean isIncreasing(List<Integer> nums) {
        for(int i = 0; i < nums.size() - 1; i++) {
            if(nums.get(i) >= nums.get(i + 1)){
                return false;
            }
        }

        return true;
    }
}
