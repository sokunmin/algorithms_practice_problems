from typing import TypeVar, List

from python.base import BaseSolution


class RotateArray(BaseSolution):
    """
    https://leetcode.com/problems/rotate-array/

    Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
    Could you do it in-place with O(1) extra space?
    """

    def test_case(self):
        return [1, 2, 3, 4, 5, 6, 7], 3
        # return [1, 2, 3, 4, 5, 6, 7], 6
        # return [1, 7], 1
        # return [1, 3, 7], 2
        # return [1, 2, 3, 4, 5, 6], 2  # -> [5,6,1,2,3,4]

    def run(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        print('Original: ', nums)
        # self._solution1(nums, k)
        # self._solution2(nums, k)
        # self._solution3(nums, k)
        self._solution4(nums, k)

    def _solution1(self, nums: List[int], k: int) -> None:
        """
        Brute Force [Time Limit Exceeded]
        Time complexity : O(n*k). All the numbers are shifted by one step(O(n)) k times(O(k)).
        Space complexity : O(1). No extra space is used.
        """
        temp = previous = 0

        for i in range(k):
            previous = nums[len(nums) - 1]
            print('> [{}] prev_target = {}'.format(i, previous))
            for j in range(len(nums)):
                temp = nums[j]
                print('>> [{}] temp = {}'.format(j, temp))
                nums[j], previous = previous, temp
                print('>> [{}] num = {}'.format(j, nums[j]))
                print('>> [{}] prev_target = {}'.format(j, previous))
                print('>>> ', nums)

        print('[1] nums: ', nums)

    def _solution2(self, nums: List[int], k: int) -> None:
        """
        Using Extra Array [Accepted]
        Time complexity : O(n). One pass is used to put the numbers in the new array. And another pass to copy the new array to the original one.
        Space complexity : O(n). Another array of the same size is used.
        """
        a = [0] * len(nums)
        for i in range(len(nums)):
            a[(i + k) % len(nums)] = nums[i]

        for i in range(len(nums)):
            nums[i] = a[i]
        print('[2] nums: ', nums)

    def _solution3(self, nums: List[int], k: int) -> None:
        """
        Using Cyclic Replacements [Accepted]
        Time complexity : O(n). Only one pass is used.
        Space complexity : O(1). Constant extra space is used.
        """

        k = k % len(nums)
        count = 0
        start_idx = 0
        while count < len(nums):
            current_idx = start_idx
            prev_value = nums[start_idx]

            while True:
                next_idx = (current_idx + k) % len(nums)
                temp = nums[next_idx]
                nums[next_idx] = prev_value
                prev_value = temp

                current_idx = next_idx
                count += 1
                if start_idx == current_idx:
                    break
            start_idx += 1
        print('[3] nums: ', nums)

    def _solution4(self, nums: List[int], k: int) -> None:
        """
        Let n=7 and k=3.

        Original List                   : 1 2 3 4 5 6 7
        After reversing all numbers     : 7 6 5 4 3 2 1
        After reversing first k numbers : 5 6 7 4 3 2 1
        After revering last n-k numbers : 5 6 7 1 2 3 4 --> Result

        Using Reverse [Accepted]
        Time complexity : O(n). n elements are reversed a total of three times.

        Space complexity : O(1). No extra space is used.
        """

        def reverse(start, end):
            while start < end:
                temp = nums[start]
                nums[start] = nums[end]
                nums[end] = temp
                start += 1
                end -= 1

        k, n = k % len(nums), len(nums)
        if k:
            reverse(0, n - 1)
            reverse(0, k - 1)
            reverse(k, n - 1)
        print('[4] nums: ', nums)

    def _solution5(self, nums: List[int], k: int) -> None:
        n = len(nums) - k
        nums[:] = nums[n:] + nums[:n]
        print('[5] nums: ', nums)

    def _solution6(self, nums: List[int], k: int) -> None:
        k = k % len(nums)
        if not k:
            return
        nums[:k], nums[k:] = nums[-k:], nums[:-k]
        print('[6] nums: ', nums)

    def _solution7(self, nums: List[int], k: int) -> None:
        """
        https://leetcode.com/problems/rotate-array/discuss/297859/Python-O(1)-time-and-space-with-explanation
        :type nums: List[int]
        :type k: int
        :rtype: None Do not return anything, modify nums in-place instead.
        """

        # adjust k so that is < len(nums) to avoid index out of bounds errors
        if k >= len(nums):
            k = k % len(nums)

        # no rotation needs to be done
        if k == 0:
            return nums

        # rotate
        j = k
        prev = nums[0]
        num_shifts = 0
        first_touched = 0
        while num_shifts < len(nums):
            t = nums[j]
            nums[j] = prev
            prev = t
            # handle the case where we wrap around and hit an already-rotated index
            # note that this will be the smallest already-rotated index if it occurs
            if j == first_touched:
                first_touched = first_touched + 1
                prev = nums[first_touched]
                j = first_touched + k
            else:
                j = (j + k) % len(nums)
            num_shifts += 1

        return nums