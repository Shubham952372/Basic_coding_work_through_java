import java.util.*;
class Rectangle
{
    
    void  Area(int l,int b)
       {

        System.out.println("area:"+l*b);
       }
       void  peri(int l , int b)
       {
        System.out.println("per:"+2*(l+b));
       }
    }
class javap2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        int p = 1;
        while(true)
        {
            if(l>0&&b>0)
            {
                break;
            }
            else
            {
                System.out.println("invalid number");
                break;
            }
        }
        Rectangle  r1  = new Rectangle();
        r1.Area(l,b);
        r1.peri(l,b);
    }
}