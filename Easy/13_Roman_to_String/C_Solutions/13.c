#include <stdio.h>
#include <string.h>

int value(char ch)
{
    switch (ch)
    {
        case 'I': return 1;
        case 'V': return 5;
        case 'X': return 10;
        case 'L': return 50;
        case 'C': return 100;
        case 'D': return 500;
        case 'M': return 1000;
        default: return 0;
    }
}

int romanToInt(char* s)
{
    int num = 0;

    for (int i = 0; s[i] != '\0'; i++)
    {
        int current = value(s[i]);

        if (s[i + 1] != '\0' && current < value(s[i + 1]))
        {
            num -= current;
        }
        else
        {
            num += current;
        }
    }

    return num;
}

int main() {
    
    char roman[20];
    printf("Enter a Roman numeral: ");
    scanf("%s", roman);

    int result = romanToInt(roman);
    printf("The integer value is: %d\n", result);

    return 0;
}