from typing import TypeVar, List

from python.base import BaseSolution


class ContainsDuplicate(BaseSolution):
    """
    https://leetcode.com/problems/contains-duplicate/
    """

    def test_case(self):
        return [[1, 2, 3, 1]]
        # return [[1,2,3,4]]
        # return [[1,1,1,3,3,4,3,2,4,2]]

    def run(self, nums: List[int]) -> bool:
        return len(set(nums)) != len(nums)
