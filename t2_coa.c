#include <stdio.h>  
int main()  
{  
   int n,carry=1; 
   scanf("%d",&n);    
   char onescomplement[n];   
   scanf("%s",onescomplement);
   char twoscomplement[n];
   for(int i=n-1; i>=0; i--)  
   {  
        if(onescomplement[i] == '1' && carry == 1)  
        {  
            twoscomplement[i] = '0';  
        }  
        else if(onescomplement[i] == '0' && carry == 1)  
        {  
            twoscomplement[i] = '1';  
            carry = 0;  
        }  
        else  
        {  
            twoscomplement[i] = onescomplement[i];  
        }  
    }  
twoscomplement[n]='\0';
printf("%s",twoscomplement);  
return 0;  
} 