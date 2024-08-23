#include <stdio.h>  
#include<string.h>

int dfa = 0;

void A(char c)
{
    if(c=='a')
    {
        dfa=1;
    }
    else if(c=='b')
    {
        dfa=0;
    }
    else
    {
        dfa=-1;
    }
}
void B(char c)
{
    if(c=='a')
    {
        dfa=1;
    }
    else if(c=='b')
    {
        dfa=2;
    }
    else
    {
        dfa=-1;
    }
}
void C(char c)
{
    if(c=='a')
    {
        dfa=3;
    }
    else if(c=='b')
    {
        dfa=2;
    }
    else
    {
        dfa=-1;
    }
}
void D(char c)
{
    if(c=='a')
    {
        dfa=3;
    }
    else if(c=='b')
    {
        dfa=3;
    }
    else
    {
        dfa=-1;
    }
}
int isAccepted(char str[])
{
    int i,len=strlen(str);
    for(i=0;i<len;i++)
    {
        if(dfa==0)
        A(str[i]);
        
        if(dfa==1)
        B(str[i]);
        
        if(dfa==2)
        C(str[i]);
        
        if(dfa==3)
        D(str[i]);
        
    }
    if(dfa==3)
    return 1;
    else
    return 0;
}
int main()
{
    char str[100];
    printf("Enter the string:");
    scanf("%s",str);
    if(isAccepted(str))
    {
        printf("ACCEPTED\n");
    }
    else
    {
        printf("NOT ACCEPTED\n");
    }
}