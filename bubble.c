#include<stdio.h>
void bubble(int a[],int n){
    int i,j,k,temp; 
    for(i=0;i<n;i++){
        for(j=i+1;j<n;j++){
            if(a[i]>a[j]){
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
    }
}
    int main()
    {
        int i,j,k,temp,n;
        printf("enter the size");
        scanf("%d",&n);
        int a[n];
        for(i=0;i<n;i++)
        scanf("%d",&a[i]);
        bubble(a,n);
        for(i=0;i<n;i++)
        printf("%d\n",a[i]);
        return 0;
    }
