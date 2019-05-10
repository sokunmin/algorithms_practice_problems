from python.leetcode.threesum import ThreeSum
from python.leetcode.twosum import TwoSum

solutions = [TwoSum(), ThreeSum()]

for s in solutions:
    print('-------------[{}]--------------'.format(s.__class__.__name__))
    print(s.run(*s.test_case()))
    print()
