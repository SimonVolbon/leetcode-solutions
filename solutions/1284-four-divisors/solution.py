class Solution:
    def sumFourDivisors(self, nums: List[int]) -> int:
        s = 0

        for num in nums:
            div = {1, num}
            for i in range(2, int(sqrt(num)) + 1):
                if num % i == 0:
                    other = int(num / i)
                    div.add(i)
                    div.add(other)

                    if len(div) > 4:
                        break
            
            if len(div) == 4:
                s = s + sum(div)

        return s
