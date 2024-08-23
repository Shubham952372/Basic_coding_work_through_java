import java.util.*;
import java.lang.*;
class sports
{
 String getname()
 {
  return("name of sport");
 }
 String getNumberOfTeamMembers()
 {
  return("number of team members");
 }
}
class soccer extends sports
{
 String getname()
 {
  return("sports name");
 }
 String getNumberOfTeamMembers()
 {
  return("team members");
 }
}
class javap5{
 public static void main(String args[])
 {
  soccer x=new soccer();
  String s1=x.getname();
  String s2=x.getNumberOfTeamMembers();
  System.out.println(s1+'\n'+s2);
 }
}
