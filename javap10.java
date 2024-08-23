import java.util.*;
class MyException extends Exception {   
}
class customer {
    public int account_number;
    public int balance = 10000;
    customer(int account_number){
        this.account_number = account_number;   
    }
    void print(){       
                System.out.println("account number = "+account_number); 
                System.out.println("balance = "+balance);    
    }
    void withdraw(int withdraw_amount){
        if (withdraw_amount> balance){  
            try {
                // Throw an object of user defined exception 
                throw new MyException();
            }
            catch (MyException ex) {
                System.out.println("In sufficient funds!!");   
            }    
        }
        else{      System.out.println("amount withdrawn successfully.");
            this.balance = this.balance - withdraw_amount;
        }
    }
    void deposit(int deposit_amount){
        this.balance += deposit_amount;    
         System.out.println("amount deposited!");
    }
}
public class javap10
{
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
customer obj = new customer(125468);
while (true){
    System.out.println("enter 1 for print.");
   System.out.println("enter 2 for withdrawal");
   System.out.println("enter 3 for deposit.");
       System.out.println("enter 4 to terminate program.");
       int choice;
       System.out.println("enter choice");
       choice = in.nextInt();
       if (choice == 4){
           System.out.println("program stopped.");
           return;
}
       else if(choice == 1){
           obj.print();
       }
       else if(choice == 2){
           System.out.println("enter withdrawal amount: ");
           int withdraw_amount = in.nextInt();
           
           obj.withdraw(withdraw_amount);
       }
       else if (choice == 3){
           System.out.println("enter deposit amount: ");
           int deposit_amount = in.nextInt();
           obj.deposit(deposit_amount);
       }
}
}
}

