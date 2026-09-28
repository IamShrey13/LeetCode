class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[] = new int[2*n];
        for (int i = 0, j = n, k = 0; k < 2*n; k++) {
            if ((k%2) == 0) {
                ans[k] = nums[i];
                i++;
            }
            else if ((k%2) != 0) {
                ans[k] = nums[j];
                j++;
            }
        }
        return ans;
    }
}