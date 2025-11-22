class Solution:
    def minimumOperations(self, nums: List[int]) -> int:
        op = 0
        for i in nums:
            if ((i + 1) % 3 == 0) or ((i - 1) % 3 == 0):
                op += 1

        return op
