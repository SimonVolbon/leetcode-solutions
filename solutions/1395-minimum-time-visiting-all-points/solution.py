class Solution:
    def minTimeToVisitAllPoints(self, points: List[List[int]]) -> int:
        time = 0
        for i in range(1 , len(points)):
            x1, y1 = points[i-1][0], points[i-1][1]
            x2, y2 = points[i][0], points[i][1]

            delta_x = abs(x1 - x2)
            delta_y = abs(y1 - y2)

            straight_times = abs(delta_x - delta_y)
            diag_times = min(delta_x, delta_y)
            print(straight_times)
            print(diag_times)
            time = time + straight_times + diag_times
            

        return time
