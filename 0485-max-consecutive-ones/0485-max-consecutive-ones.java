class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, k = 0;
        int arr[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            }
            else if (i == nums.length-1 && nums[i] == 0) break;
            else if (nums[i] == 0) {
                arr[k] = count;
                k++;
                count = 0;
            }
        }
        arr[k] = count;
        int max = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (max < arr[j]) max = arr[j];
        }
        return max;
    }
}