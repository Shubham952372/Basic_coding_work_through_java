#include<stdio.h>
int linear(int a[],int p,int n){
int i=0;
for(i=0;i<n;i++)
{
    if(a[i]==p)
    return i;
}
return -1;
}
int main()
{
    int n,p,i;
    scanf("%d%d",&p,&n);
    int a[n];
    printf("enter the element");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    int result=linear(a,p,n);
    printf("%d",result);
    return 0;
    
}