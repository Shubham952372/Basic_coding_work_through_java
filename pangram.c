#include<stdio.h>
#include<stdlib.h>
 int main()
 {
    char str[50];
    int count[26]={0},i;
    printf("enter the sentences:\n");
    fgets(str,50,stdin);
    for(i=0;str[i]!='\0';i++)
    {
        if(str[i]==32)
        continue;
        if(str[i]>96)
        count[str[i]-97]++;
        else
        count[str[i]-65]++;
    }
    for(i=0;i<26;i++)
    {
        if(count[i]==0)
        {
            printf("not a pangram\n");
            exit(-1);
        }
    }
    printf("pangram\n");
 }




 