#include<stdio.h>
#include<windows.h>
int main()
{
    int h,m,s,min;
    int d=10;
    printf("set time:\n");
    scanf("%d%d%d%d",&h,&m,&s,&min);
    if(h>24||m>60||s>60||min>60)
    {
        printf("ERROR !\n");
        exit(0);
    }
    while(1){
        min++;
        if(min>59){
          s++;
          min=0;
        }
        if(s>59){
            m++;
            s=0;
        }
        if(m>59)
        {
            h++;
            m=0;
        }
        if(h>24){
            h=1;
        }
        printf("\n Clock:");
        printf("\n %.2d:%.2d:%.2d:%.2d",h,m,s,min);
       // Sleep(d);

        system("cls");
    }

    }
