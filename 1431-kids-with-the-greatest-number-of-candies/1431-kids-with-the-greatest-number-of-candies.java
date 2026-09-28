class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            int max = candies[i] + extraCandies;
            boolean possible = true;
            for (int j = 0; j < candies.length; j++) {
                if (max < candies[j]) {
                    possible = false;
                    break;
                }
            }
            ans.add(possible);
        }
        return ans;
    }
}