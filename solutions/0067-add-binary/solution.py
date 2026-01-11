class Solution:
    def addBinary(self, a: str, b: str) -> str:
        m = max(len(a), len(b))
        a = a[::-1] ++ (m-len(a)) * "0"
        b = b[::-1] ++ (m-len(b)) * "0"
        c = 0
        res = ""
        for i in range(m):

            s = int(a[i]) + int(b[i]) + c
            c = int(s / 2)
            res = res + str(s % 2)

        if c == 1:
            res = res + "1"

        return res[::-1]

            
            
