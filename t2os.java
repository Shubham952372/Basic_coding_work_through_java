import java.util.*;

public class Deadlock1 extends Thread
{
    String resource1 = "R1";
    void run()
    {
        synchronized(resource1)
        {
            System.out.println("Thread 1 acquired lock on R1"); 
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
            System.out.println(e);
            }
            synchronized(resource2)
            {
            System.out.println("Thread 1 acquired lock on R2");
            }
               
        } 
    }
}
public class Deadlock2 extends Thread
{
    String resource2 = "R2";
    void run()
    {
    synchronized(resource2)
        {
            System.out.println("Thread 2 acquired lock on R2");
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            synchronized(resource1)
            {
                System.out.println("Thread 2 acquired lock on R1");
            }
        }
    } 
}
public Class t20s
{
    public static void main(String []args)
    {
    Thread t1 = new Deadlock1();
    Thread t2 = new Deadlock2();
    t1.start();
    t2.start();
    }
}