class Solution:
    def kLengthApart(self, nums: List[int], k: int) -> bool:
        leap = 0
        gotOne = False
        for i in range(len(nums)):
            if gotOne == False:
                if nums[i] == 1:
                    gotOne = True
            else:
                if nums[i] == 1:
                    if leap >= k:
                        leap = 0
                    else:
                        return False
                else:
                    leap += 1
        
        return True
                
            

