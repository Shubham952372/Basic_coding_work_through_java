class dada
{
  public void display()
  {
    System.out.println("bajaj");
  }
}
class papa extends dada
{
   public void display()
   {
    super.display();
    System.out.println("range rover");
   }
}
class beta extends papa
{
  public void display()
  {
    super.display();
    System.out.println("hero");
  }
}
class practice1
{
    public static void main(String args [])
    {
      beta b = new beta();
      b.display();
    }
}