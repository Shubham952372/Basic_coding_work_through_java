#include<stdio.h>
int main(){
    int i,j,n,temp=0;
    scanf("%d",&n);
    int a[n];
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    for(i=0;i<n;i++){
        for(j=1;j<n;j++)
        {
            if(a[j]<a[j-1])
    {
         temp=a[j];
         a[j]=a[j-1];
         a[j-1]=temp;
        }
    }
    }
    for(i=0;i<n;i++)
    printf("%d\n",a[i]);
}