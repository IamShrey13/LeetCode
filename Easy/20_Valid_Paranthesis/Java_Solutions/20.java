class Solution {
    public boolean isValid(String s) {
        Stack <Character> stck = new Stack<>();
        for(char c:s.toCharArray()) {
            if(c == '(' || c == '[' || c == '{') {
                stck.push(c);
            } else{
                if(stck.isEmpty()){
                    return false;
                }
                char top = stck.pop();
                if (c == ')' && top != '(') {
                    return false;
                }
                if (c == ']' && top != '[') {
                    return false;
                }
                if (c == '}' && top != '{') {
                    return false;
                }
            }
        }
        return stck.isEmpty();
    }
}