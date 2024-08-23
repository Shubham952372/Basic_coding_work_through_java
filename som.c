#include<stdio.h>
# define n 5
int top=-1;
void main()
{
    int i,a,ele;
    int stack[n];
    if(top==-1)
    printf("stack is full");
    else
    {
        top=top+1;
        printf("Enter element");
        scanf("%d",&a);
        stack[top]=a;
    }

    for(i=top;i>=0;i--)
    {
        printf("stack element is :%d",stack[i]);
    }

}