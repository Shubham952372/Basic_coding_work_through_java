/*import java.util.*;
class Arith{
    int add(int x,int y)
    {
        int sum;
        sum = x+y;
        return sum;
    }
}
class javap4
{
    public static void main (String args [])
    {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        Arith a1 = new Arith();
        int result = a1.add(a,b);
        System.out.println("sum:"+result);
    }
}*/
import java.lang.*;
import java.util.Scanner;
class Arithmatic
{
 int add(int x,int y)
 {
  return(x+y);
 }
}
class Adder extends Arithmatic
{
 public static void main(String args[])
 {
  Adder addition=new Adder();
  Scanner sc=new Scanner(System.in);
  System.out.println("enter first number:");
  int a=sc.nextInt();
  System.out.println("enter Second number:");
  int b=sc.nextInt();
  int sum=addition.add(a,b);
  System.out.println("Sum is"+sum);
 }
}
