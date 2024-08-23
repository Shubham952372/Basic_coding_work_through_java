#include <stdio.h>
#include<string.h>
#include<ctype.h>
#include<math.h>
#include<stdlib.h>
int stack[10];
int top=-1,k=0;
struct dict
{
    char e[3];
    int val;
}a[10];
int pop()
{
    return stack[top--];
}
void push(int a)
{
    stack[++top]=a;
}
void reverse(char s[])
{
    for(int i=0,j=strlen(s)-1;i<j;i++,j--)
    {
        int t=s[i];
        s[i]=s[j];
        s[j]=t;
    }
}
int main()
{
    char s[30],temp[5];
    scanf("%s",s);
    reverse(s);
    int n=strlen(s),cnt=0,coeff=1,i=0;
    for(int j=0;j<n;j++)
    {
        if(s[j]>=48&&s[j]<=57)
        {
            if(s[j]=='1')
            {
                printf("IMPOSSIBLE...........FORMULA");
                exit(0);
            }
            int di=s[j]-48;
           cnt += (int)di * pow(10,i);
            i += 1 ;
        }
        else if(s[j]==')')
        {
                push(cnt);
                coeff *= cnt;
                cnt=0;
                i = 0;
        }
        else if(s[j]=='(')
        {
            coeff /= pop();
            cnt=0;
            i = 0;
        }
        else if(isalpha(s[j])!=0)
        {
            if(islower(s[j])==0)
            {
                temp[0]=s[j];
                temp[1]='\0';
                strcpy(a[k].e,temp);
            }
           else
           {
               temp[0]=s[j+1];
               temp[1]=s[j];
               temp[2]='\0';
               j++;
               strcpy(a[k].e,temp);    
           }
            
        
                   if(cnt==0)
                   a[k].val=coeff;
                   else
                   a[k].val=cnt* coeff;
                k++;
                i=0;
                cnt=0;
        }
    }
    for(i=0;i<k-1;i++)
    {
        for(int j=i+1;j<k;j++)
        {
            if(a[i].e[0]>=a[j].e[0])
            {
                 char tem[10];
                 strcpy(tem,a[i].e);
                 strcpy(a[i].e,a[j].e);
                 strcpy(a[j].e,tem);
                 int te=a[i].val;
                 a[i].val=a[j].val;
                 a[j].val=te;
            }
        }
    }
    for(i=0;i<k-1;i++)
    {
        for(int j=i+1;j<k;j++)
        {
            if(strcmp(a[i].e,a[j].e)==0)
            {
                strcpy(a[j].e,"$");
                a[i].val+=a[j].val;
            }
        }
    }
    for(i=0;i<k;i++)
    if(strcmp(a[i].e,"$")!=0)
    printf("%s%d",a[i].e,a[i].val);
    printf("\nEXPLANATION IS :\n");
    for(i=0;i<k;i++)
    if(strcmp(a[i].e,"$")!=0)
    printf("%s  :  %d\n",a[i].e,a[i].val);   
}