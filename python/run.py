from python.leetcode.threesum import ThreeSum

from python.leetcode.top_interview_questions_easy.array import *
# from python.leetcode.top_interview_questions_easy.array.single_number import SingleNumber
from python.leetcode.twosum import TwoSum

# solutions = [TwoSum(), ThreeSum()]
solutions = [IntersectionOfTwoArrays2()]

for s in solutions:
    print('-------------[{}]--------------'.format(s.__class__.__name__))
    print('Final Result:', s.run(*s.test_case()))
    print()
