class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        print(digits)
        digits[len(digits) - 1] = digits[len(digits) - 1] + 1
        print(digits)
        for i in range(len(digits) -1, -1, -1):
            rest = int(digits[i] / 10)
            print(str(digits[i]) + " " + str(rest))
            
            if(rest == 0):
                return digits
            
            digits[i] = digits[i] - 10*rest

            if i != 0:
                digits[i - 1] = digits[i - 1] + 1
            else:
                if digits[i] == 0:
                    return [1] + digits
  
