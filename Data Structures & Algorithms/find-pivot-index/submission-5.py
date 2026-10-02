class Solution:

    def pivotIndex(self, nums: List[int]) -> int:        
        sumArr = []
        sumArr.append(nums[0])
        for i in range(1, len(nums)):
            sumArr.append(sumArr[i-1] + nums[i])
        
        leftSum = 0
        for i in range(len(nums)):
            rightSum = sumArr[len(nums) - 1] - nums[i] - leftSum
            if leftSum == rightSum: return i
            leftSum += nums[i]

        return -1