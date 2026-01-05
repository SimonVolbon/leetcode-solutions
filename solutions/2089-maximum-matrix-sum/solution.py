class Solution:
    def maxMatrixSum(self, matrix: List[List[int]]) -> int:
        totalAbs = 0
        smallestElement = sys.maxsize
        negCount = 0

        for row in matrix:
            for element in row:
                totalAbs = totalAbs + abs(element)
                if abs(element) < smallestElement:
                    smallestElement = abs(element)
                if element < 0:
                    negCount = negCount + 1

        print(totalAbs)
        print(smallestElement)
        if negCount % 2 != 0:
            totalAbs = totalAbs - 2*smallestElement

        return totalAbs


