#include<stdio.h>
int main()
{
    int i,j,k,l;
    int rows,col;
    printf("enter the rows and col");
    scanf("%d\n%d",&rows,&col);
    int arr[rows][col];
    printf("enter the elements");
    for(i=0;i<rows;i++)
    {
        for(j=0;j<col;j++)
        {
            scanf("%d",&arr[i][j]);
        }
    }
    for(i=0;i<rows;i++)
    {
        for(j=0;j<col;j++)
        {
            for(k=0;k<rows;k++)
            {
                for(l=0;l<col;l++)
                {
                    if(arr[i][j]<arr[k][l])
                    {
                        int temp = arr[i][j];
                        arr[i][j] = arr[k][l];
                        arr[k][l] =temp;
                    }
                }
            }
        }
    }
    for(i=0;i<rows;i++)
    {
        for(j=0;j<col;j++)
        {
            scanf("%d",arr[i][j]);
    
        }

    }
}


