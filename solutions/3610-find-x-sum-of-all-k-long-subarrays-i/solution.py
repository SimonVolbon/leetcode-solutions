class Solution:
    def findXSum(self, nums: List[int], k: int, x: int) -> List[int]:
        sum=[]

        for i in range(len(nums) - k + 1):
            lastNum = None
            sub = nums[i:i + k]
            sub.sort()
            counts = {}
            print("Sublist = " + str(sub))
            for j in sub:
                if lastNum is None:
                    counts[j] = 1
                    lastNum = j
                elif lastNum != j:
                    counts[j] = 1
                    lastNum = j
                else:
                    counts[j] = counts[j] + 1

            counts = dict(sorted(counts.items(), reverse= True))
            counts = dict(sorted(counts.items(), key=lambda item: item[1], reverse=True))

            curr_sum = 0
            keys = list(counts.keys())
            values = list(counts.values())
            print("Counts = " + str(counts))
            for m in range(x):
                if m >= len(keys):
                    break
                curr_sum += int(keys[m]) * int(values[m])
            sum.append(curr_sum)
            print("Sum = " + str(sum))
        return sum
            
