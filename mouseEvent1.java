import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Myframe extends JFrame implements MouseListener {

    JTextArea t2;
    JLabel l;
    Myframe()
    {
        Container c = getContentPane();
        setLayout(null);

        l= new JLabel("SHUBHAM KUMAR PANDIT");
        l.setBounds(10,10,100,30);
        c.add(l);

        t2 = new JTextArea();
        t2.setBounds(200,10,170,480);
        c.add(t2);

        l.addMouseListener(this);
    }
    public void mouseEntered(MouseEvent e)
    {
     t2.setText(t2.getText()+"\n"+"mouse is enter");
    }
     public void mouseExited(MouseEvent e)
    {
      t2.setText(t2.getText()+"\n"+"mouse is exit"); 
    }
    public void mousePressed(MouseEvent e)
    {
        t2.setText(t2.getText()+"\n"+"mouse is Press");
    }
    public void mouseClicked(MouseEvent e)
    {
     t2.setText(t2.getText()+"\n"+"mouse is clicked");   
    }
    public void mouseReleased(MouseEvent e)
    {
      t2.setText(t2.getText()+"\n"+"mouse is released");  
    }


}
class mouseEvent1
{
    public static void main(String args [])
    {
        Myframe f = new Myframe();
        f.setBounds(100,100,500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}