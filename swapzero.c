#include<stdio.h>
void swap(int a[],int i,int j)
{
    int t = a[i];
    a[i] = a[j];
    a[j] = t;
}
int main()
{
    int i=0,j=0,t,n;
    scanf("%d",&n);
    int a[n];
    for(i=0;i<n;i++)
    scanf("%d",&a[i]);
    for(i=0;i<n;i++){
    if(a[i]!=0)
    {
        swap(a,i,j);
        j++;
    }
    }
    for(i=0;i<n;i++){
    printf("%d",a[i]);}
    return 0;

}