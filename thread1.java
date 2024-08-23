ass NewThread implements Runnable
{
String name;
Thread t;
NewThread(String threadname)
{
name = threadname;
t = new Thread(this, name);
System.out.println("New
thread: " + t);
t.start();
}
public void run()
{
try
{
for(int i = 5; i > 0; i--)
{
System.out.println(name + ": " + i);
Thread.sleep(1000);
}
}
catch (InterruptedException e)
{
System.out.println(name +
"Interrupted");
}
System.out.println(name + " exiting.");
}
}
class thread1
{
public static void main(String args[])
{
new NewThread("One");
new NewThread("Two");
new NewThread("Three");
try
{
Thread.sleep(10000);
}
catch (InterruptedException e)
{
System.out.println(" thread
Interrupted");
}
System.out.println("
thread exiting.");
}
}
