#include<stdio.h>
#include<string.h>
int main()
{
    char st[100];
    scanf("%s",st);
    int i,count[26]={0},c=0,d=0,digit[10]={0};
    for(i=0;st[i]!='\0';i++)
    {
        if(st[i]>='a'&&st[i]<='z')
        count[st[i]-97]++;
        else if(st[i]>=48&&st[i]<=57)
        digit[st[i]-48]++;

    }
    for(i=0;i<26;i++)
    {
        if(count[i]%2==0)
        c++;
    }
    for(i=0;i<10;i++)
    {
        if(digit[i]%2==0)
        d++;

    }
    if(c==26&&d==10)
    printf("pairing is possible");
    else
    printf("pairing is not possible");


}