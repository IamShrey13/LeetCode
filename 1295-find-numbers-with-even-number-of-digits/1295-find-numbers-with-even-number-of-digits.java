class Solution {
    public int findNumbers(int[] nums) {
        int enod = 0;
        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];
            int nod = 0;
            while (number != 0) {
                number /= 10;
                nod++;
            }
            if (nod % 2 == 0) enod++;
        }
        return enod;
    }
}