from python.leetcode.threesum import ThreeSum
from python.leetcode.top_interview_questions_easy.array.max_profit import MaxProfit
from python.leetcode.top_interview_questions_easy.array.remove_duplicates import RemoveDuplicatesFromSortedArray
from python.leetcode.twosum import TwoSum

# solutions = [TwoSum(), ThreeSum()]
solutions = [MaxProfit()]

for s in solutions:
    print('-------------[{}]--------------'.format(s.__class__.__name__))
    print(s.run(*s.test_case()))
    print()
