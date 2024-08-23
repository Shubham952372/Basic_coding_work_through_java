import java.util.*;

abstract class shape
{
    abstract void sides();
}
class triangle extends shape{
    void sides()
    {
        System.out.println("triangle side: 3");
    }
}
class rectangle extends shape {
    void sides()
    {
        System.out.println("rectangle sides: 4");
    }
}
class trapezoid extends shape 
{
    void sides()
    {
        System.out.println("trapezoid sides : 6");
    }
}
class javap7
{
    public static void main(String args [])
    {
        triangle t = new triangle();
        t.sides();
        rectangle r = new rectangle();
        r.sides();
        trapezoid t1 = new trapezoid ();
        t1.sides();


    }
}