#include<stdio.h>
void merge_sort(int a[],int n,int l,int h);
void main()
{
    int i,j,n,l,h;
    printf("enter the size");
    scanf("%d",&n);
    int a[n];
    printf("enter the element");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    mergesort(a,l,h);
    for(i=0;i<n;i++)
    printf("%d",a[i]);

}
merge_sort(int l,int h,int a){
    if(l!=h){
        int mid;
        mid=(l+h)/2;
        mergesort(l,mid);
        mergesort(mid,h);
        merge(l,mid,h);
    }
}
merge(int l,int mid,int h, int n,int a){
    int temp[n];
    int i=l;
    int k=l;
    int j=mid+1;
    while((i<=mid)&&(j<=h))
    {
        if(a[i]<=a[j])
        temp[k++]=a[i++];
        else 
        temp[k++]=a[j++];
    }
    while(i<=mid)
    temp[k++]=a[i++];
    while(j<=h)
    temp[k++]=a[j++];
    for(i=l;i<h;i++)
    {
        a[i]=temp[i];
    }
    }
