class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int sublen = 0;
                if (nums[j]-nums[i] == 1) { sublen = j-i+1; }
                if (sublen > max) max = sublen;
            }
        }
        return max;
    }
}