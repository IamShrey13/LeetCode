class Solution {
    public int dominantIndex(int[] nums) {
        int largest = nums[0];
        int largeidx = 0;
        for (int i = 1; i < nums.length; i++) {
            if (largest < nums[i]) {
                largest = nums[i];
                largeidx = i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i == largeidx) continue;
            if (!(nums[i]*2 <= largest)) return -1;
        }
        return largeidx;
    }
}