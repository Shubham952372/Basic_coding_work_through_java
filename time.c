#include<stdio.h>
#include<time.h>
struct time{
    int h;
    int m;
    int s;

};
int main()
{   struct tm* current_time;
    s = time(0);
   current_time=localtime(&s)
   printf("%.2d:%.2d:%.2d",current_time->h,current_time->m,current_time->s);

}


