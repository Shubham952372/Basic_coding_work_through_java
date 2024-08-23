#include<stdio.h>
int selection(int a[],int n){
int i,j,p,temp,min;
for(i=0;i<n-1;i++)
{
    min=a[i];
    for(j=i+1;j<n;j++)
    {
        if(min>a[j])
        {
            min = a[j];
            p=j;
        }
    }
    if(min != a[i])
    {
        temp = a[i]; 
        a[i] = a[p];
        a[p] = temp;
    } 
}
}

int main()
{
    int i,j,min,n;
    printf("enter the size: ");
    scanf("%d",&n);
    int a[n];
    printf("enter the element");
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);                                                     
    }
    selection(a,n);
    for(i=0;i<n;i++) {
     printf("%d ",a[i]);
    }
}