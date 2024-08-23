import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Myframe extends JFrame implements MouseMotionListener{
    JLabel l1;
    JTextArea t1;
    Container c;
    public Myframe()
    {
        c = getContentPane();
        c.setLayout(null);

        l1 = new JLabel("shubham");
        l1.setFont(new Font("arial",Font.BOLD,18));
        l1.setBounds(50,50,150,30);
        c.add(l1);

        t1 = new JTextArea();
        t1.setBounds(300,30,100,400);
        c.add(t1);
         
        l1.addMouseMotionListener(this);


    }
    public void mouseDragged(MouseEvent e)
    {
     t1.setText(t1.getText()+"\n"+"mouse is dragged");
    }
    public void mouseMoved(MouseEvent e)
    {
     t1.setText(t1.getText()+"\n"+"mouse is moved");
    }


}

class mousemotion{
    public static void main(String args[])
    {
        Myframe f = new Myframe();
        f.setTitle("mousemotion");
        f.setBounds(100,100,700,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }
} 