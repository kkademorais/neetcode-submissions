class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        solution = maxSolution = 0
        for num in nums:
            solution += 1
            if num == 0: solution = 0
            if solution > maxSolution: maxSolution = solution
        return maxSolution
        