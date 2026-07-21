#include <stdio.h>
#include <string.h>

char* longestCommonPrefix(char** strs, int strsSize) {
    if (strsSize == 0)
    return "";

    char* longst = strs[0];
    for(int i = 1; i < strsSize; i++){
        int j = 0;
        while(longst[j] != '\0' && strs[i][j] != '\0' && longst[j] == strs[i][j]){ j++; }

        longst[j] = '\0';
        if(longst[0] == '\0')
        return "";
    }
    return longst;
}

int main() {
    char* strs[] = {"flower", "flow", "flight"};
    int strsSize = sizeof(strs) / sizeof(strs[0]);
    char* result = longestCommonPrefix(strs, strsSize);
    printf("Longest Common Prefix: %s\n", result);
    return 0;
}