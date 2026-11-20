class Solution:
    def findLHS(self, nums: list[int]) -> int:
        nums = sorted(nums)
        max_len = 0
        i = 0
        for j in range(len(nums)):
            while nums[j] - nums[i] > 1:
                i += 1
            if nums[j] - nums[i] == 1:
                max_len = max(max_len, j - i + 1)
        return max_len