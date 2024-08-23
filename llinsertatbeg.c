#include<stdio.h>
#include<stdlib.h>
struct node 
{
    int data ;
    struct node*next;
};
int main()
{
    int ch;
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
       struct node*avail;
       avail=(struct node*)malloc(sizeof(struct node));
       printf("enter the value");
       scanf("%d",&avail->data);
       avail->next=head;
       head=avail;

        temp=head;
        while(temp!=0)
        {
            printf("%d\t%p\n",temp->data,temp->next);
            temp=temp->next;
     
        }
}