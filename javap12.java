import java.util.*;

class myexp extends Exception{
    myexp(){
        super();
    }
}

public class Main
{
public static void main(String[] args) {

Scanner in = new Scanner(System.in);
System.out.println("enter age: ");
int age = in.nextInt();

if(age<=18){
   try{
       throw new myexp();
   }
   catch(myexp e){
       System.out.println("Not eligible to vote"); 
   }
}
else{
 System.out.println("Eligible to vote!");
}
}
}
