class Sports
{
  public String getName()
    {
        String s="cricket";
        return s;
    }
   public int getNumberOfTeamMember()
    {
        int a=11;
        return a;
    }

    }
class Soccer extends Sports
{   
   public String getName()
    {
        String x="football";
        return x;
    }
    public int getNumberOfTeamMember()
    {
        int y=11;
        return y;
    }
}
class s3{
    public static void main(String args[]){
        Sports sp = new Sports();
       // System.out.println(sp.getName());
       // System.out.println(sp.getNumberOfTeamMember());

        Soccer so = new Soccer();
        System.out.println(so.getName());
        System.out.println(so.getNumberOfTeamMember());
    }
}