class Solution:
    def prefixesDivBy5(self, nums: List[int]) -> List[bool]:
        arr = []
        current_val = 0
        
        for bit in nums:
            current_val = (current_val * 2 + bit) % 5
            arr.append(current_val == 0)
            
        return arr
