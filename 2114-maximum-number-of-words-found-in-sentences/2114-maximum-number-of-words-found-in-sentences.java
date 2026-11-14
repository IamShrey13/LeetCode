class Solution {
    public int mostWordsFound(String[] sentences) {
        int now[] = new int[sentences.length];
        for (int i = 0; i < sentences.length; i++) {
            char[] charnums = sentences[i].toCharArray();
            int nos = 0;
            for (int j = 0; j < charnums.length; j++) {
                if (charnums[j] == ' ') nos++;
            }
            now[i] = nos + 1;
        }
        int maxword = now[0];
        for (int k = 1; k < now.length; k++) {
            if (maxword < now[k]) maxword = now[k];
        }
        return maxword;   
    }
}