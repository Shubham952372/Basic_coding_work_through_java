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
        temp=head;
        while(temp!=0)
        {
            printf("%d\t%p\n",temp->data,temp->next);
            temp=temp->next;
        }
       temp=head;
       ptr=temp->next;
       while(ptr->next!=0)
       {
        ptr=ptr->next;
        temp=temp->next;
       }
       temp->next=NULL;

       temp=head;
       while(temp!=0)
       {
        printf("%d\n",temp->data);
        temp=temp->next;
       }
}
