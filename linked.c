#include<stdio.h>
#include<stdlib.h>
struct node 
{
    int data ;
    struct node*next;
};
int main()
{
    int ch,value;
    struct node* temp,*newnode,*head,*ptr;
    head=0;
    while(ch)
    {
        newnode=(struct node*)malloc(sizeof(struct node));
        printf("enter the data");
        scanf("%d",&newnode->data);
        newnode->next=0;
        if(head==NULL)
        {
          printf("Do u want to continue[0,1]:");
          scanf("%d",&ch);
          head=temp=newnode;

        }
        else
        {
            temp->next=newnode;
            temp=newnode;
            printf("do u want to continue [0,1]:");
            scanf("%d",&ch);
        
        }
    }
    printf("enter the kth element:");
    scanf("%d\n",&value);
    head=temp;
    while(temp!=0)
    {
      if(temp->data==value)
      {
        break;
      }
    }
    ptr->data=value;
}