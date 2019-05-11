from typing import TypeVar, List

from python.base import BaseSolution
import time
import collections

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
        return [[-1, 0, 1, 2, -1, -4]]
        # return [[0, 0, 0]]
        # return [[-4, -2, -2, -2, 0, 1, 2, 2, 2, 3, 3, 4, 4, 6, 6]]
        # return [[13, -14, -10, -4, 4, 4, 0, -14, 5, -9, -3, -10, 14, 7, -3, -4, -3, 12, -14, 2, -11, -6, 0, -7, 13, -2,
        #         -7, -11, -14, -13, 5, 14, -12, 11, -13, -1, -8, 2, 0, 4, 1, 4, 10, -8, -11, -8, 3, 1, 11, 4, -12, 8, 5,
        #         -4, -14, -4, 9, -13, -8, 2, -11, 12, -7, 14, 0, -5, -2, 7, 5, 5, -3, 13, -6, -8, -10, -10, -9, 0, 6, -12,
        #         11, 2, 11, 1, 13, 4, 12, -1, 6, -11, -14, 2, 9, -6, 1, -6, -4, 14, -13, 8, 4, -1, 6, 6, -2, 11, 11, 4,
        #         -4, -5, -1, -8, 12, -13, 1, 10, 7, -10, -14, -10, -5, -13, 0, 11]]

    def run(self, nums: List[int]) -> List[List[int]]:
        # [1]
        # start = time.time()
        # result = self._method1(nums)
        # end = time.time()
        # print('[1] Elapsed: {}'.format(end - start))

        # [2]
        # start = time.time()
        # result = self._method2(nums)
        # end = time.time()
        # print('[2] Elapsed: {}'.format(end - start))

        # [3]
        start = time.time()
        result = self._method3(nums)
        end = time.time()
        print('[3] Elapsed: {}'.format(end - start))

        # [4]
        start = time.time()
        result = self._method4(nums)
        end = time.time()
        print('[3] Elapsed: {}'.format(end - start))

        # [5]
        start = time.time()
        result = self._method5(nums)
        end = time.time()
        print('[3] Elapsed: {}'.format(end - start))
        return result

    def _method1(self, nums):
        nums.sort()
        size = len(nums)
        if len(nums) == 3 and sum(nums) == 0:
            return [nums]

        idx = 0
        result = set()
        for a in range(0, size - 2):
            if a > 0 and nums[a] == nums[a - 1]:
                continue

            # print('A:', a)
            for b in range(a + 1, size):
                if b > a + 2 and nums[b] == nums[b - 1]:
                    continue
                # print('B:', b)

                for c in range(size - 1, b, -1):
                    # print('C:', c)
                    if c < size - 2 and nums[c] == nums[c + 1]:
                        continue

                    s = nums[a] + nums[b] + nums[c]
                    print('[{}] {} + {} + {} = {}'.format(idx, nums[a], nums[b], nums[c], s))
                    idx += 1
                    sol = [nums[a], nums[b], nums[c]]
                    if s == 0:
                        result.add(tuple(sol))
                print()

        return list(map(list, result))

    def _method2(self, nums):
        nums.sort()
        print('nums: ', nums)
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

            print('A: {}, B: {}, C: {}'.format(a, b, c))
            _sum = nums[a] + nums[b] + nums[c]
            _sol = [nums[a], nums[b], nums[c]]

            idx += 1
            if _sum == 0 and tuple(_sol) not in checkup:
                checkup.add(tuple(_sol))
                result.append(_sol)
                print('[{}] {} + {} + {} = {}'.format(idx, nums[a], nums[b], nums[c], _sum))

            # iterate c first.
            c -= 1

            if c == b:  # [...,b,c,...]
                b, c = b + 1, size - 1  # [....,b+1,...,c]
                print()
                if b == c:  # [....,b+1,c]
                    a += 1
                    b, c = a + 1, size - 1
                    print()

        return result

    def _method3(self, nums):
        # https://leetcode.com/problems/3sum/discuss/222521/Python-solution
        result = []
        n = len(nums)
        nums = sorted(nums)
        for a in range(n - 2):
            if a > 0 and nums[a] == nums[a - 1]:
                continue
            b = a + 1
            c = n - 1
            new_target = -nums[a]
            while b < c:
                summ = nums[b] + nums[c]
                if summ < new_target:
                    b += 1
                elif summ > new_target:
                    c -= 1
                else:
                    result.append([nums[a], nums[b], nums[c]])
                    while b < c and nums[b + 1] == nums[b]:
                        b += 1
                    b += 1
                    while c > b and nums[c - 1] == nums[c]:
                        c -= 1
                    c -= 1
        return result

    def _method4(self, nums):

        if len(nums) < 3:
            return []
        nums.sort()
        res = set()
        for i, v in enumerate(nums[:-2]):
            if i >= 1 and v == nums[i - 1]:
                continue
            d = {}
            for x in nums[i + 1:]:
                if x not in d:
                    d[-v - x] = 1
                else:
                    res.add((v, -v - x, x))
        return list(map(list, res))

    def _method5(self, nums):
        # https://leetcode.com/problems/3sum/discuss/7482/Fastest-Python-solution-180-ms
        instances = {}
        for n in nums:
            if n in instances:
                instances[n] += 1
            else:
                instances[n] = 1
        values = []
        result = []
        for n, count in sorted(instances.items()):
            values.append(n)
            if n == 0 and count >= 3:
                result.append([0,0,0])
            elif n != 0 and count >= 2:
                third = -2*n
                if third in instances:
                    if n < third:
                        result.append([n,n,third])
                    else:
                        result.append([third,n,n])
        #any sums involving duplicate values were handled above
        nvalues = len(values)
        while nvalues >= 3:
            floor = -(values[nvalues-1] + values[nvalues-2])
            ceiling = -(values[0] + values[1])
            if floor > ceiling:
                return []
            iLeft = nvalues
            iRight = -1
            for i in range(nvalues):
                if values[i] >= floor:
                    iLeft = i
                    break
            for i in range(nvalues-1, -1, -1):
                if values[i] <= ceiling:
                    iRight = i
                    break
            if iLeft == 0 and iRight == nvalues - 1:
                break
            values = values[iLeft:iRight+1]
            nvalues = len(values)
        if nvalues < 3:
            return result

        for i in range(nvalues-2):
            v1 = values[i]
            if v1 >= 0:
                break
            for j in range(i+1,nvalues-1):
                v2 = values[j]
                v3 = -(v1 + v2)
                if v3 <= v2:
                    break
                if v3 in instances:
                    result.append([v1,v2,v3])
        return result