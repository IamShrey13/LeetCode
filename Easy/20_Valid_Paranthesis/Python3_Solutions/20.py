class Solution:
    def isValid(self, s: str) -> bool:
        stk = []
        for c in s:
            if c in "({[" :
                stk.append(c)
            else:
                if not stk:
                    return False
                top = stk.pop()
                if c == ')' and top != '(':
                    return False
                if c == '}' and top != '{':
                    return False
                if c == ']' and top != '[':
                    return False
        return len(stk) == 0
        