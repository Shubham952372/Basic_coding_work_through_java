import java.util.*;
class array {
    public static void main(String args [])
    {
        int i;
        int a[]=new int [10];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int max=-1;
        for(i=0;i<n;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        
    
        System.out.println("diff is:"+(max-a[0]));

    }
}