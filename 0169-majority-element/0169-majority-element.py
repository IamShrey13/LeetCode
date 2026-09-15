class Solution:
    def majorityElement(self, nums):

        map = {}

        for i in range(len(nums)):
            map[nums[i]] = map.get(nums[i], 0) + 1

        maxValue = float('-inf')
        maxKey = 0

        for key, value in map.items():
            if value > maxValue:
                maxValue = value
                maxKey = key

        return maxKey