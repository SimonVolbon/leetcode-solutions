class Solution:
    def getSneakyNumbers(self, nums: List[int]) -> List[int]:
        bitMap = [False]*(len(nums) - 2)
        duplicates = []
        for num in nums:
            if(bitMap[num] == False):
                bitMap[num] = True
            else:
                duplicates.append(num)
                if len(duplicates) == 2:
                    return duplicates

        return duplicates

