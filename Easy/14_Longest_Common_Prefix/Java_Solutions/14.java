class Solution {
    public String longestCommonPrefix(String[] strs) {
        String longst = strs[0];

        for(int i = 0; i < strs.length; i++){
            int j = 0;
            while(j < longst.length() && j < strs[i].length() && longst.charAt(j) == strs[i].charAt(j)){ j++; }

            longst = longst.substring(0,j);

            if(longst.isEmpty()){
                return "";
            }
        }
        return longst;
    }
}