# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxLevelSum(self, root: Optional[TreeNode]) -> int:
        level = 1
        currMaxLevel = 1
        currMax = root.val
        q = deque()
        adj = [root]
        newLevelNodes = []
        containsANumber = False
        while True:

            s = 0
            for node in adj:
                s = s + node.val

            if s > currMax:
                currMax = s
                currMaxLevel = level

            newLevelNodes.clear()

            containsANode = False

            for node in adj:
                if(node.left != None):
                    newLevelNodes.append(node.left)
                    containsANode = True
                if(node.right != None):
                    newLevelNodes.append(node.right)
                    containsANode = True

            if containsANode == False:
                break

            adj = newLevelNodes.copy()
            level = level + 1
        
        return currMaxLevel
