import java.util.*;

interface AdvancedArithmetic {
    public void divisor_sum(int n);
}
class MyCalculator
{
    public int divisor_sum(int n)
    {
        int sum=0;
        for(int i =1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        System.out.println(sum);
        return 0;

    }
}
      
    

class javap8
{
    public static void main(String args [])
    {
        System.out.println("enter the number :");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        MyCalculator a = new MyCalculator();
        a.divisor_sum(n);

    }
}