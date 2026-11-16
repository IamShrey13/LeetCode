
class Solution {
    public int thirdMax(int[] nums) {
        int max1 = nums[0];
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        boolean secondFound = false;
        boolean thirdFound = false;
        for (int i = 1; i < nums.length; i++) {
            if (max1 < nums[i]) {
                max1 = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == max1) continue;
            if (!secondFound || max2 < nums[i]) {
                max2 = nums[i];
                secondFound = true;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == max1 || 
                (secondFound && nums[i] == max2)) {
                continue;
            }
            if (!thirdFound || max3 < nums[i]) {
                max3 = nums[i];
                thirdFound = true;
            }
        }
        if (!thirdFound) {
            return max1;
        }
        return max3;
    }
}