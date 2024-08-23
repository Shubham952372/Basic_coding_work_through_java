import java.util.*;
class javat12 {
    public static void main(String args [])
    {
        int i,j;
        int a[][]=new int [3][3];
        Scanner sc = new Scanner (System.in);
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                if(i%2!=0)
                {
                    int n=1;
                    int temp=a[2];
                    for(i=n;i>=0;i--)
                    {
                        a[i]=a[i-1];
                    }
                    a[0]=temp;
                }
                else
                {
                    int p=2;
                    while(p--)
                    {
                        int temp=a[2];
                        for(i=p;i>=0;i--)
                        {
                            a[i]=a[i-1];
                        }
                        a[0]=temp;
                    }
                }
            }
        
            

            
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++){
        Systen.out.println("required result:"+a[i][j]);
         }
        }

    } 
}