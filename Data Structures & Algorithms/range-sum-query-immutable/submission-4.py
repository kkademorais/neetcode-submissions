class NumArray:

    def __init__(self, nums: List[int]):
        self.arr = []
        self.arr = nums

    def sumRange(self, left: int, right: int) -> int:
        sum = 0
        while left <= right:
            if left == right: sum += self.arr[left]
            else:
                sum += (self.arr[left] + self.arr[right])
            left +=1
            right -=1
        return sum


# Your NumArray object will be instantiated and called as such:
# obj = NumArray(nums)
# param_1 = obj.sumRange(left,right)