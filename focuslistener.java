import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Myframe extends JFrame implements FocusListener{

    JTextField f1;
    JTextArea a1;
    Myframe()
    {
        Container c = getContentPane();
        c.setLayout(null);

        f1 = new JTextField();
        f1.setBounds(10,10,200,30);
        c.add(f1);

        a1 = new JTextArea();
        a1.setBounds(100,100,200,100);
        c.add(a1);

        f1.addFocusListener(this);

    
    }
    public void focusGained(FocusEvent e)
    {
      a1.setText(a1.getText()+"\n"+"focus");
    }
     public void focusLost(FocusEvent e)
    {
        a1.setText(a1.getText()+"\n"+"focus lost");
    }

}
class FocusListener{
    public static void main(String args [])
    {
        Myframe f = new Myframe();
        f.setTitle("focuslistener");
        f.setBounds(100,100,500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }
}