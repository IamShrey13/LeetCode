class Solution {
    public int singleNumber(int[] nums) {
        int var = 0;
        for (int i = 0; i < nums.length; i++) {
            var = var^nums[i];
        }
        return var;
    }
}