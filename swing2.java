import javax.swing.*;//SWING PACKAGE
public class swing2 extends JFrame{
    public swing2()   //to take default string without passing
    {

    }
    public swing2(String s)//to pass the string "swing example"
    {
    super(s);
    }
    public static void main (String [] args){
        swing2 jf = new swing2("Swing example");
        jf.setSize(300,300);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}