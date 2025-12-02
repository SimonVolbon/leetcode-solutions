class Solution:
    def countTrapezoids(self, points: List[List[int]]) -> int:
        counts = {}
        for x, y in points:
            counts[y] = counts.get(y,0) + 1

        clean_counts = {key: value for key, value in counts.items() if value != 1}

        total = 0
        sum = 0

        for count in clean_counts.values():
            if count < 2:
                continue
            
            curr_amount = (count * (count - 1)) // 2
            
            total = (total + curr_amount * sum) % (10**9+7)
            
            sum = (sum + curr_amount) % (10**9+7)

        return total
