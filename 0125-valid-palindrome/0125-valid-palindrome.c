#include<ctype.h>
#include<stdlib.h>
#include<stdio.h>
#include<string.h>
bool isPalindrome(char s[]) {
    int n=strlen(s);
    //char str[n];
    char* str=(char*)malloc(n+1);
    int j=0,i,size=0;
    for(int i=0;i<n;i++)
    {
        if(isalnum(s[i]))
        {
          str[j++]=s[i];
          size++;
        }
    }
    str[j]='\0';
    for(i=0;i<size/2;i++)
    {
        if(tolower(str[i])!=tolower(str[size-i-1]))
        {
            return false;
        }
    }
    return true;
    
}