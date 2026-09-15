class Solution:
    def containsNearbyDuplicate(self, nums, k):
        map = {}
        for i in range(len(nums)):
            if nums[i] in map:
                previousIndex = map[nums[i]]
                if i - previousIndex <= k:
                    return True
            map[nums[i]] = i
        return False