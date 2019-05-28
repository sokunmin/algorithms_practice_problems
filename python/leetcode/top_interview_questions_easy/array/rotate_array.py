from typing import TypeVar, List

from python.base import BaseSolution
import copy

class RotateArray(BaseSolution):
    """
    https://leetcode.com/problems/rotate-array/

    Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
    Could you do it in-place with O(1) extra space?
    """

    def test_case(self):
        return [1, 2, 3, 4, 5, 6, 7], 3

    def run(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        print('Original: ', nums)
        self._solution1(nums, k)
        self._solution2(nums, k)
        self._solution3(nums, k)

    def _solution1(self, nums: List[int], k: int) -> None:
        right_idx = len(nums) - 1
        temp = copy.deepcopy(nums[right_idx])

        while right_idx >= 0:
            print(nums[right_idx])
            if right_idx == 0:
                nums[right_idx] = temp
            else:
                print('switch_idx = {} -> {}'.format(right_idx - k, nums[right_idx - k]))
                nums[right_idx] = nums[right_idx - k]
            right_idx -= 1
        print('Output: ', nums)

    def _solution2(self, nums: List[int], k: int) -> None:
        pass

    def _solution3(self, nums: List[int], k: int) -> None:
        pass