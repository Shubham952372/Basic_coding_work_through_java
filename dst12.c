#include<stdio.h>
#include<stdlib.h>

#define N 5
void push();
void pop();
void max();

int stack[N];
int top=-1;
void main()
{
    int ch;
    while(1)
    {
      printf("\n 1.push:");
      printf("\n 2.pop:");
      printf("\n 3.max:");

      printf("\n enter the choice:");
      scanf("%d",&ch);
       switch(ch)
        {
            case 1:push();
            break;
            case 2:pop();
            break;
            case 3:max();
            break;
            default:printf("no choice");

        }
     }


    }




void push()
{
    int a;
    if(top==4)
    {
        printf("overflow\n");
    }
    else {
         top++;
         printf("enter the data to insert\n");
         scanf("%d",&a);
         stack[top]=a;
    } 
}
 void pop()
 {
    int item;
    if(top==-1)
        printf("underflow\n");
    else {
        item=stack[top];
        printf("%d\n",item);
        top--;
    }
 }
 void max()
 {
    int i,c=0;
    if(top==-1)
    printf("\n stack is empty\n");
    else{
        while(top!=-1)
        {
            c++;
            top--;
        }
        printf("%d",c);
    }
 }