from functools import reduce

class Solution:
    def minOperations(self, nums: List[int], k: int) -> int:
        sum = reduce(lambda x, y: x + y, nums)
        return sum % k
