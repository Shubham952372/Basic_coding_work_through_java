import java.util.*;
class javat11{

    public static void main(String args [])
    {
        int i,j;
        int a[]=new int [4];
        Scanner sc = new Scanner (System.in);
        for(i=0;i<4;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<4;i++)
        {
            for(j=i;j<4;j++)
            {
                if(a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]= temp;
                }
            }
        } 
       int time=0;
        time = a[0]+3*a[1]+a[3];
        System.out.println("TIME IS: " +time );
    }
}   
     

    


