#include<stdio.h>
int main()
{
    int n;
    printf("enter the size:");
    scanf("%d",&n);
    int digit[10]={0};
    int i,a[n];
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    for(i=0;i<n;i++)
    {
        digit[a[i]]++;
    }
    for(i=0;i<10;i++)
    {
        printf("%d:%dtimes",i,digit[i]);
        printf("\n");
    }
    return 0;
}
