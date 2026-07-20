from typing import List

class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        longst = strs[0]
        for item in strs[1:]:
            i = 0
            while i < len(longst) and i < len(item) and longst[i] == item[i]:
                i +=1
            longst = longst[:i]
            if longst == "":
                return ""
        return longst