class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        uniquePos = 1
        currNum = nums[0]
        for i in range(1,len(nums)):
            if nums[i] != currNum:
                if i != uniquePos:
                    nums[uniquePos] = nums[i]
                uniquePos = uniquePos + 1
                currNum = nums[i]
        
        return uniquePos
