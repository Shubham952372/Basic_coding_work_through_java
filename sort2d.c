#include<stdio.h>
int main()
{
    int i,j,k;
    int n,m;
    printf("enter the rows");
    scanf("%d",&n);
    printf("enter the col");
    scanf("%d",&m);
    int a[n][m];
    printf("enter the element");
     for(i=0;i<n;i++)
    {
        for(j=0;j<m;j++)
        {
            scanf("%d",&a[i][j]);
        }
    }
   
    for(i=0;i<n;i++)
    {
        for(j=0;j<m;j++)
        {
          for(k=0;k<n-1;k++)
          {
            if(a[i][k]>a[i][k+1])
            {
                //swap
                int temp=a[i][k];
                a[i][k]=a[i][k+1];
                a[i][k+1]=temp;
            }
          }
        }
    }
     for(i=0;i<n;i++)
    {
        for(j=0;j<m;j++)
        {
          for(k=0;k<n-1;k++)
          {
            if(a[k][j]>a[k+1][j])
            {
                //swap
                int temp=a[k][j];
                a[k][j]=a[k+1][j];
                a[k+1][j]=temp;
            }
          }
        }
    }
       for(i=0;i<n;i++)
    {
        for(j=0;j<m;j++)
        {
            printf("%d\t",a[i][j]);
        }
        printf("\n");
    }

    return 0;

  
}
