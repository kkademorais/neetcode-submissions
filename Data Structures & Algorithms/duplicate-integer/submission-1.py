class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        map = {}
        i = 0
        for num in nums:
            if num in map:
                return True
            map[num] = i
            i += 1
        return False
        