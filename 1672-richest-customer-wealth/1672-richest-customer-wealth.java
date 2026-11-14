class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth[] = new int[accounts.length];
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            wealth[i] = sum;
        }
        int maxwealth = wealth[0];
        for (int k = 1; k < wealth.length; k++) {
            if (maxwealth < wealth[k]) maxwealth = wealth[k];
        }
        return maxwealth;
    }
}