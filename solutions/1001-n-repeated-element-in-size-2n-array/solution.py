class Solution:
    def repeatedNTimes(self, nums: List[int]) -> int:
        d = {}
        for num in nums:
            if num in d.keys():
                return num
            else:
                d.setdefault(num, 1)
