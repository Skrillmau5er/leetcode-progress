# Space complexity O(1)
# Time complexity O(m+n)

class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """

        ins_pos = m + n - 1
        m_p = m - 1
        n_p = n - 1

        while n_p >= 0:
            if m_p >= 0 and nums1[m_p] > nums2[n_p]:
                nums1[ins_pos] = nums1[m_p]
                m_p -= 1
            else:
                nums1[ins_pos] = nums2[n_p]
                n_p -= 1
            ins_pos -= 1