class Solution:
    def countPartitions(self, nums: List[int]) -> int:
        count = 0
        for i in range(len(nums) - 1):
            sum1 = sum(nums[0:i])
            sum2 = sum(nums[i:len(nums)])
            if (sum1 - sum2) % 2 == 0:
                count = count + 1

        return count
