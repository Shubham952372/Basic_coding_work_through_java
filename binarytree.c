#include<stdio.h>
#include<stdlib.h>
struct node 
{
    int data;
    struct node* left;
    struct node* right;
};
struct node* newnode(int data)
{
    struct node* newnode = (struct node*)malloc(sizeof(struct node));
    newnode->data = data;
    newnode->left = NULL;
    newnode->right = NULL;
    return newnode;
}
struct node* insert(struct node*root,int data)
{
    if(root==NULL)
    {
        return newnode(data);
    }
    if(data<root->data)
    {
        root->left = insert(root->left,data);
    }
    else{
        root->right = insert(root->right,data);
    }
    return root;
}
void inorder(struct node* root)
{
    if(root!=NULL)
    {
        inorder(root->left);
       printf("%d\t",root->data);
        inorder(root->right);
       // printf("%d\t",root->data);
    }
}
int main()
{
    struct node*root = NULL;
    int ch;
    scanf("%d",&ch);
    while(ch--)
    {
        int data;
        scanf("%d",&data);
        root = insert(root,data);
    }
    inorder(root);
    return 0;
}
