from typing import TypeVar, List

from python.base import BaseSolution


class TwoSum(BaseSolution):

    def test_case(self):
        return [2, 7, 11, 15], 9

    def run(self, nums: List[int], target: int) -> List[int]:
        table = {}
        for i in range(0, len(nums)):
            a = nums[i]
            b = target - a
            if b in table:
                return [table[b], i]
            table[a] = i
        return []
