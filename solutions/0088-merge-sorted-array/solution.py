class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        new_1 = nums1[0:m]
        
        for i in range(m+n):
            if len(new_1) == 0 and  len(nums2) != 0:
                nums1[i] = nums2.pop(0)
                continue 

            if len(new_1) != 0 and  len(nums2) == 0:
                nums1[i] = new_1.pop(0)
                continue 

            if len(new_1) == 0 and  len(nums2) == 0:
                break

            if(new_1[0] < nums2[0]):
                nums1[i] = new_1.pop(0)
            else:
                nums1[i] = nums2.pop(0)

        
