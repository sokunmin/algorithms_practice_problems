from typing import TypeVar, List

from python.base import BaseSolution


class IntersectionOfTwoArrays2(BaseSolution):
    """
    https://leetcode.com/problems/intersection-of-two-arrays-ii/
    Note:

    Each element in the result should appear as many times as it shows in both arrays.
    The result can be in any order.
    Follow up:

    What if the given array is already sorted? How would you optimize your algorithm?
    What if nums1's size is small compared to nums2's size? Which algorithm is better?
    What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
    """

    def test_case(self):
        # return [1, 2, 2, 1], [2, 2]
        return [4, 9, 5], [9, 4, 9, 8, 4, 4, 9]

    def run(self, nums1: List[int], nums2: List[int]) -> List[int]:

        dict1 = {}
        for n in nums1:
            dict1[n] = dict1[n] + 1 if n in dict1 else 1

        dict2 = {}
        for n in nums2:
            dict2[n] = dict2[n] + 1 if n in dict2 else 1

        result = []
        if len(dict1) >= len(dict2):
            for k, v in dict2.items():
                if k in dict1:
                    result.extend([k] * min(v, dict1[k]))
        elif len(dict1) < len(dict2):
            for k, v in dict1.items():
                if k in dict2:
                    result.extend([k] * min(v, dict2[k]))

        return result
