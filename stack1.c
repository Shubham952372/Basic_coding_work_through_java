#include<stdio.h>
#include<stdlib.h>

#define N 5
void push();
void pop();
void display();

int stack[N];
int top=-1;
void main()
{
    int ch;
    while(1)
    {
      printf("\n 1.push:");
      printf("\n 2.pop:");
      printf("\n 3.display:");
      printf("\n 4.exit:");

      printf("\n enter the choice:");
      scanf("%d",&ch);
       switch(ch)
        {
            case 1:push();
            break;
            case 2:pop();
            break;
            case 3:display();
            break;
            default:printf("no choice");

        }
     }


    }




void push()
{
    int a;
    if(top==N-1)
    {
        printf("overflow\n");
    }
    else {
         top++;
         printf("enter the data to insert");
         scanf("%d",&a);
         stack[N]=a;
    }
}
 void pop()
 {
    int item;
    if(top==-1)
        printf("underflow\n");
    else {
        item=stack[N];
        printf("%d\n",item);
        top--;
    }
 }
 void display()
 {
    int i;
    if(top==-1)
    printf("\n stack is empty\n");
    else{
        for(i=top;i>=0;i--)
        printf("%d\n",stack[i]);
        }
    }
