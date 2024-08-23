import java.util.*;

class Arithmetic {
     int add(int x,int y)
     {
        int sum=x+y;
        return sum;
     } 

}
  class Adder extends Arithmetic {
    int addition(int a,int b)
    {
        int sum=a+b;
       return sum;
    }
 }
 class s2{
    public static void main(String args []){
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();

       Adder ad = new Adder();
    // int result= ad.addition(a,b); 
     int result = ad.add(a,b);
       System.out.println(result);

    }
 }