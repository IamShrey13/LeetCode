class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, maxC = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) count++;
            else {
                if (maxC < count) maxC = count;
                count = 0;
            }
        }
        if (maxC < count) maxC = count;
        return maxC;
    }
}