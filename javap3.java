import java.util.*;
class Animal
{
    public void walk()
    {
        System.out.println("walking");
    }
}
class Bird extends Animal 
{
    public void fly()
    {
        System.out.println("flying");
    }
}
class  javap3
{
    public static void main(String args[])
    {
        Bird b = new Bird();
        b.walk();
        b.fly();
    }
}