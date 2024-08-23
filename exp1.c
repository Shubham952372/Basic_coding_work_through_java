#include<stdio.h>
#include<limits.h>
int main()
{
	int t,max1=0,max2=0;
	scanf("%d",&t);
	while(t--)
	{
		int n,i,c=0;
		scanf("%d",&n);
		int a[n];
		for (i=0;i<n;i++) 
		scanf("%d",&a[i]);
		 for (i=0;i<n;i++) {
               if(a[i]==a[i+1]){
				    c++;}}
		if(c==n-1)
		printf("%d\n",-1);
		else
		 {
			// int max1, max2;
			 max1 = max2 =INT_MIN;
			  for (i=0;i<n;i++) {
				  if(a[i]>max1){
					  max2=max1;
					  max1 = a[i];}
				  else if(a[i]>max2 && a[i]<max1){
					  max2 = a[i];}
			  }}
		 printf("%d\n",max2);
}
return 0;
}