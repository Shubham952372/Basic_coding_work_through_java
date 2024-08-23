#include<stdio.h>
int binary(int a[],int l,int r,int element,int n){
int i,j,mid;
l=0,r=n-1;
while(l<=r)
{
 mid=(l+r)/2; 
 if(a[mid]==element)
 return mid;
 else if(element<a[mid])
     r=mid-1;
     else
     l=mid+1;
}
return -1;

}
int main()
{
    int i,j,element,l,r,n,mid;
    scanf("%d%d%d%d",&l,&r,&element,&n);
    int a[n];
    printf("enter the element:");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    int result=binary(a,l,r,element,n);
    printf("%d",result);
    return 0;
}