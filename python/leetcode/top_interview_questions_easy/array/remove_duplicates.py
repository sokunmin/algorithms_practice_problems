from typing import TypeVar, List

from python.base import BaseSolution


class RemoveDuplicatesFromSortedArray(BaseSolution):

    """
    https://leetcode.com/problems/remove-duplicates-from-sorted-array/
    """
    def test_case(self):
        return [[0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 4, 4]]
        # return [[1, 1, 2]]
        # return [[0]]
        # return [[0, 0]]

    def run(self, nums: List[int]) -> List[int]:
        """
        Runtime: 68 ms, faster than 50.34% of Python3 online submissions for Remove Duplicates from Sorted Array.
        Memory Usage: 14.7 MB, less than 5.43% of Python3 online submissions for Remove Duplicates from Sorted Array
        """
        i = len(nums) - 1
        while i > 0:
            if nums[i] == nums[i - 1]:
                del nums[i]
            i -= 1
        size = len(nums)

        """
        Runtime: 60 ms, faster than 82.48% of Python3 online submissions for Remove Duplicates from Sorted Array.
        Memory Usage: 14.8 MB, less than 5.43% of Python3 online submissions for Remove Duplicates from Sorted Array.
        """

        for idx in range(len(nums) - 1, 0, -1):
            if nums[idx] == nums[idx - 1]:
                del nums[idx]

        size = len(nums)
        return nums

