import java.util.*;
class javap1{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        int x=1;
        while(x!=0)
        {
            System.out.println("welcome to powered air services.What would you like to dp!");
            System.out.println("A.know my balance");
            System.out.println("B.know my validity");
            System.out.println("C.know number of free calls");
            System.out.println("D.more");
            char ch = sc.next().charAt(0);
            switch(ch)
            {
                case 'a':System.out.println("$10000");
                break;
                case 'b':System.out.println("01/01/2030");
                break;
                case 'c':System.out.println("10");
                break;
                case 'd':System.out.println("Select a option");
                         System.out.println("1.prepared bill requested\t\t");
                         System.out.println("2.customer preference");
                         System.out.println("3.GPRS ACTIVATION \t\t");
                         System.out.println("4.special msg offer\t");
                         System.out.println("5.special GPRS offer\t\t");
                         System.out.println("6.3G activation");
                         System.out.println("go back to previous menu");
                         int a = sc.nextInt();
                         switch(a)
                         {
                            case 1:System.out.println("no any requests");
                            break;
                            case 2:System.out.println("Dial 1552999 to get supports");
                            break;
                            case 3:System.out.println("$149/-per month");
                            break;
                            case 4:System.out.println("$10-100SMS\n$20-250SMS");
                            break;
                            case 5:System.out.println("not available");
                            break;
                            case 6:System.out.println("ye 4G ka jamana hai hai");
                            break;
                            case 7:
                            break;
                            default : System.out.println("invalid option");
                         }
                         break;
                         default : System.out.println("invalid option");
            }
            System.out.println("Do you want to continue:[0/1]:");
            x = sc.nextInt();
        }
    }
}
