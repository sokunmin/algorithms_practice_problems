from typing import TypeVar, List

from python.base import BaseSolution


class SingleNumber(BaseSolution):
    """
    https://leetcode.com/problems/single-number/
    Given a non-empty array of integers, every element appears twice except for one. Find that single one.

    Note:
    Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
    """

    def test_case(self):
        return [[4, 1, 2, 1, 2]]
        # return [[1,2,3,4]]
        # return [[1,1,3,4,3,2,4]]

    def run(self, nums: List[int]) -> int:
       return self._solution1(nums)

    def _solution1(self, nums: List[int]) -> int:
        """
        List operation
        --------------
        Iterate over all the elements in \text{nums}nums
        If some number in \text{nums}nums is new to array, append it
        If some number is already in the array, remove it

        Time complexity : O(n^2). We iterate through `nums`, taking O(n) time.
        We search the whole list to find whether there is duplicate number, taking O(n) time.
        Because search is in the for loop, so we have to multiply both time complexities which is O(n^2).

        Space complexity : O(n). We need a list of size nn to contain elements in `nums`.
        """
        distincts = list()

        for n in nums:
            if n in distincts:
                distincts.remove(n)
            else:
                distincts.append(n)
        return distincts.pop()

    def _solution2(self, nums: List[int]) -> int:
        """
        Hash Table
        ----------
        We use hash table to avoid the O(n) time required for searching the elements.

        Iterate through all elements in `nums`
        Try if `hash_table` has the key for `pop`
        If not, set up key/value pair
        In the end, there is only one element in `hash_table, so use `popitem` to get it

        Time complexity : O(n⋅1) = O(n).
        Time complexity of for loop is O(n).
        Time complexity of hash table(dictionary in python) operation pop is O(1).

        Space complexity : O(n). The space required by `hash_table` is equal to the number of elements in `nums`.
        """
        distincts = set()

        for n in nums:
            if n in distincts:
                distincts.remove(n)
            else:
                distincts.add(n)
        return distincts.pop()

    def _solution3(self, nums: List[int]) -> int:
        """
        Math
        ----
        2 * (a + b + c) - ( a + a + b + b + c) = c

        Time complexity : O(n + n) = O(n). `sum` will call `next` to iterate through `nums`.
        We can see it as `sum(list(i, for i in nums))` which means the time complexity is O(n)
        because of the number of elements(nn) in `nums`.

        Space complexity : O(n + n) = O(n). `set` needs space for the elements in `nums`
        """
        return 2 * sum(set(nums)) - sum(nums)

    def _solution4(self, nums: List[int]) -> int:
        """
        Bit Manipulation
        ----------------
        If we take XOR of zero and some bit, it will return that bit
          - a ⊕ 0 = a
        If we take XOR of two same bits, it will return 0
          - a ⊕ a = 0
        - a ⊕ b ⊕ a = (a ⊕ a) ⊕ b = 0 ⊕ b = b

        Time complexity : O(n). We only iterate through `nums`, so the time complexity is the number of elements in `nums`.

        Space complexity : O(1).
        """
        a = 0
        for i in nums:
            a ^= i
        return a

