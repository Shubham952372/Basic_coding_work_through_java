#include<stdio.h>
#include<stdlib.h>
struct node 
{
    int data ;
    struct node*next;
};
int main()
{
    int ch,count=0,value,k=0;
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
         //   count++;
        }
    }
       printf("enter the value");
       scanf("%d",&value);
       temp=head;
       while(temp!=0)
       {
        if(temp->data==value)
        {
            printf("%d\t%d\n",value,k);
            break;
        }
        else
        {
            temp=temp->next;
            k++;
        }
       }
       temp=head;
       while(temp!=0)
       {
        printf("%d\t%p\n",temp->data,temp->next);
        temp=temp->next;
       }
       if(k==count+1)
       printf("element is not present");
}
