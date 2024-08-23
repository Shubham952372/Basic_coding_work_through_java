import java.util.*;
public class javap11
{
public static void main(String[] args) {
 
Scanner in = new Scanner(System.in);
int a,b;
System.out.println("enter two numbers: ");
a = in.nextInt();
b = in.nextInt();
try {
   System.out.println(a/b);
}
catch(Exception e){
   System.out.println("Any number cannot be divided by zero.");
}
}
}
