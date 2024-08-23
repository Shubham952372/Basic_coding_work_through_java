import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

abstract class Myframe 
{
    abstract void KeyPressed();
}

 class Myframe extends JFrame implements KeyListener{
    JTextArea t1;
    Myframe()
    {
        Container c  = getContentPane();
        c.setLayout(null);

        t1 = new JTextArea();
        t1.setBounds(10,10,470,470);
        c.add(t1);

        t1.addKeyListener(this);
    }
    public void KeyPressed(KeyEvent e)
    {
      t1.setText(t1.getText()+"\n"+"key is pressed");
    }
   public void KeyReleased(KeyEvent e)
   {
    t1.setText(t1.getText()+"\n"+"key is released");
    }
     public void KeyTyped(KeyEvent e)
    {
     t1.setText(t1.getText()+"\n"+"key is typed");
    }
}

class KeyEvent1
{
    public static void main(String args [])
    {
        Myframe f= new Myframe();
        f.setTitle("KEY EVENT");
        f.setBounds(100,100,500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}