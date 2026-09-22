class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        int a = 0;
        for (int i = 0; i < n; i++) {
            boolean b = true;
            for (int j = 0; j < i; j++) {
                if (candyType[i] == candyType[j]) {
                    b = false;
                    break;
                }
            }
            if (b) a++;
        }
        if (a > n/2) a = n/2;
        return a;
    }
}