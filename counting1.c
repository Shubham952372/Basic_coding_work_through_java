#include<stdio.h>
int main()
{
    int i,n,t;
    scanf("%d",&n);
    int a[n],c=0;
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    for(i=0;i<n;i++)
    {
        while(a[i]!=0)
        {
            t = a[i]%10;
            if(t==1)
            {
                c++;
            }
            a[i]=a[i]/10;
        }
    }
    printf("%d",c);
   return 0;
}