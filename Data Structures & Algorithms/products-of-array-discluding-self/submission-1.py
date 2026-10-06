class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        arr = []
        output = 1
        arr.append(output)
        for i in range(1, len(nums)):          
            output *= nums[i-1]
            arr.append(output)

        output = 1
        for i in range(len(nums)-1, -1, -1):
            arr[i] *= output
            output *= nums[i]

        return arr