class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        words = s.split(" ")
        words = list(filter(lambda a: a != '', words ))
        return len(words[-1])
