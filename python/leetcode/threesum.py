from typing import TypeVar, List

from python.base import BaseSolution
import time
"""
Iteration example:
  a   b            c 
[-4, -1, -1, 0, 1, 2] => [-4, -1, 2] = -3

  a   b         c 
[-4, -1, -1, 0, 1, 2] => [-4, -1, 1] = -4

  a   b      c  
[-4, -1, -1, 0, 1, 2] => [-4, -1, 0] = -5

  a   b   c  
[-4, -1, -1, 0, 1, 2] => [-4, -1, -1] = -6

  a       b        c
[-4, -1, -1, 0, 1, 2] => [-4, -1, 2] = -3

  a       b     c   
[-4, -1, -1, 0, 1, 2] => [-4, -1, 1] = -4

  a       b  c 
[-4, -1, -1, 0, 1, 2] => [-4, -1, 0] = -5

  a          b     c
[-4, -1, -1, 0, 1, 2] => [-4, 0, 2] = -2

  a          b  c
[-4, -1, -1, 0, 1, 2] => [-4, 0, 1] = -3

  a             b  c
[-4, -1, -1, 0, 1, 2] => [-4, 1, 2] = -1
-----------------------------------------

      a   b        c
[-4, -1, -1, 0, 1, 2] => [-1, -1, 2] = 0 *

      a   b     c
[-4, -1, -1, 0, 1, 2] => [-1, -1, 1] = -1

      a   b  c
[-4, -1, -1, 0, 1, 2] => [-1, -1, 0] = -1

      a      b     c
[-4, -1, -1, 0, 1, 2] => [-1, 0, 2] = 1

      a      b  c
[-4, -1, -1, 0, 1, 2] => [-1, 0, 1] = 0 *

      a         b  c
[-4, -1, -1, 0, 1, 2] => [-1, 1, 2] = 2
-----------------------------------------

          a  b     c
[-4, -1, -1, 0, 1, 2] => [-1, 0, 2] = 1

          a  b  c
[-4, -1, -1, 0, 1, 2] => [-1, 0, 1] = 1

          a     b  c
[-4, -1, -1, 0, 1, 2] => [-1, 1, 2] = 0 *
-----------------------------------------

             a  b  c
[-4, -1, -1, 0, 1, 2] => [0, 1, 2] = 3
"""


class ThreeSum(BaseSolution):

    def test_case(self):
        # return [[-1, 0, 1, 2, -1, -4]]
        return [[0, 0, 0]]
        # return [[-4, -2, -2, -2, 0, 1, 2, 2, 2, 3, 3, 4, 4, 6, 6]]
        # return [[13, -14, -10, -4, 4, 4, 0, -14, 5, -9, -3, -10, 14, 7, -3, -4, -3, 12, -14, 2, -11, -6, 0, -7, 13, -2,
        #         -7, -11, -14, -13, 5, 14, -12, 11, -13, -1, -8, 2, 0, 4, 1, 4, 10, -8, -11, -8, 3, 1, 11, 4, -12, 8, 5,
        #         -4, -14, -4, 9, -13, -8, 2, -11, 12, -7, 14, 0, -5, -2, 7, 5, 5, -3, 13, -6, -8, -10, -10, -9, 0, 6, -12,
        #         11, 2, 11, 1, 13, 4, 12, -1, 6, -11, -14, 2, 9, -6, 1, -6, -4, 14, -13, 8, 4, -1, 6, 6, -2, 11, 11, 4,
        #         -4, -5, -1, -8, 12, -13, 1, 10, 7, -10, -14, -10, -5, -13, 0, 11]]

    def run(self, nums: List[int]) -> List[List[int]]:
        # [1]
        start = time.time()
        result = self._method1(nums)
        end = time.time()
        print('[1] Elapsed: {}'.format(end - start))

        # [2]
        start = time.time()
        result = self._method2(nums)
        end = time.time()
        print('[2] Elapsed: {}'.format(end - start))
        return result

    def _method1(self, nums):
        nums.sort()
        size = len(nums)
        if len(nums) == 3 and sum(nums) == 0:
            return nums

        idx = 0
        checkup = set()
        result = []
        for a in range(0, size - 2):
            # print('A:', a)
            for b in range(a + 1, size):
                # print('B:', b)
                if b > a + 2 and nums[b] == nums[b - 1]:
                    continue

                for c in range(size - 1, b, -1):
                    # print('C:', c)
                    if c < size - 2 and nums[c] == nums[c + 1]:
                        continue
                    s = nums[a] + nums[b] + nums[c]
                    print('[{}] {} + {} + {} = {}'.format(idx, nums[a], nums[b], nums[c], s))
                    idx += 1
                    sol = [nums[a], nums[b], nums[c]]
                    if s == 0 and tuple(sol) not in checkup:
                        checkup.add(tuple(sol))
                        result.append(sol)
                print()

        print('Result: ', result)

    def _method2(self, nums):
        nums.sort()
        size = len(nums)
        if size == 3 and sum(nums) == 0:
            return [nums]

        idx = 0
        checkup = set()
        result = []
        a = 0
        b = a + 1
        c = size - 1

        while a < size - 2:
            # print('A: {}, B: {}, C: {}'.format(a, b, c))
            _sum = nums[a] + nums[b] + nums[c]
            _sol = [nums[a], nums[b], nums[c]]

            idx += 1
            if _sum == 0 and tuple(_sol) not in checkup:
                checkup.add(tuple(_sol))
                result.append(_sol)
                print('[{}] {} + {} + {} = {}'.format(idx, nums[a], nums[b], nums[c], _sum))
            c -= 1
            if c == b:
                c = len(nums) - 1
                b += 1
                print()
                if b == c:
                    a += 1
                    b = a + 1
                    c = len(nums) - 1
                    print()
