from typing import TypeVar, List

from python.base import BaseSolution
import collections


class MaxProfit(BaseSolution):
    """
    https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
    """

    def test_case(self):
        # return [[7, 1, 5, 3, 6, 4]]
        # return [[7, 6, 4, 3, 1]]
        # return [[1, 2, 3, 4, 5, 6, 7]]
        # return [[5, 4, 3, 2, 1, 0]]
        return [[1, 7, 2, 3, 6, 7, 6, 7]]

    def run(self, prices: List[int]) -> int:
        print(prices)
        # [1] brute force
        # return self._calculate1(prices, 0)

        # [2] peak valley
        return self._calculate2(prices)

        # [3] simple one pass
        # return self._calculate3(prices)

    def _calculate1(self, prices: List[int], s: int):
        """
        Brute Force
        Time complexity : O(n^n). Recursive function is called n^n times.

        Space complexity : O(n). Depth of recursion is nn.
        """
        if s >= len(prices):
            return 0

        max = 0
        print()
        print('[1] ----- {} ~ {} -----'.format(prices[s], prices[len(prices) - 1]))
        for start in range(s, len(prices), 1):
            max_profit = 0
            if (start + 1) < len(prices):
                print('> [2] ----- {} ~ {} -----'.format(prices[start + 1], prices[len(prices) - 1]))
            else:
                print('> [2] ----- {} -----'.format(prices[start]))
            for i in range(start + 1, len(prices), 1):
                print('>> [3] {} ~ {}'.format(prices[start], prices[i]))
                sub_p = self.calculate(prices, i + 1)
                profit = sub_p + prices[i] - prices[start]
                print('>> [3] {} + {} - {} = {}'.format(sub_p, prices[i], prices[start], profit))
                if profit > max_profit:
                    max_profit = profit

            if max_profit > max:
                max = max_profit
        print('>>> profit = {}'.format(max))
        print()
        return max

    def _calculate2(self, prices: List[int]):
        """
        Time complexity : O(n). Single pass.

        Space complexity : O(1). Constant space required.
        """
        i = 0
        valley = prices[0]
        peak = prices[0]
        max_profit = 0

        while i < len(prices) - 1:
            # search valleys
            print('[valley] {} >= {} = {}'.format(prices[i], prices[i + 1], str(prices[i] >= prices[i + 1])))
            while i < len(prices) - 1 and prices[i] >= prices[i + 1]:
                i += 1

            valley = prices[i]
            print('valley({}) = {}'.format(i, valley))
            # search peaks
            print('[peak] {} >= {} = {}'.format(i, prices[i], prices[i + 1], str(prices[i] <= prices[i + 1])))
            while i < len(prices) - 1 and prices[i] <= prices[i + 1]:
                i += 1

            peak = prices[i]
            print('peak({}) = {}'.format(i, peak))
            max_profit += peak - valley
            print('profit = {}, ({} - {})'.format(max_profit, peak, valley))
            print()
        return max_profit

    def _calculate3(selfself, prices: List[int]):
        """
        Time complexity : O(n). Single pass.

        Space complexity: O(1). Constant space needed.
        """
        max_profit = 0
        for i in range(1, len(prices)):
            if prices[i] > prices[i - 1]:
                max_profit += prices[i] - prices[i - 1]

        return max_profit
