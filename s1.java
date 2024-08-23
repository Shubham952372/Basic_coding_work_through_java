class Sports {
       
       void getName()
       {
        System.out.println("cricket");
     
       }
      void getNumberOfTeam()
       {
        System.out.println("no of team:11");
       }
}
class Soccer extends Sports{
    void display()
    {
        System.out.println("football");
    }
} 
public class s1{
    public static void main(String args[]){
        Soccer sc = new Soccer();
              sc.getName();
              sc.getNumberOfTeam();
              sc.display();

    }
}