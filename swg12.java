import javax.swing.*;
import java.awt.*;

class swg12
{
    public static void main(String args[]){
        JFrame jf = new JFrame();
        jf.setBounds(100,100,700,500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = jf.getContentPane();
        c.setLayout(null);

        JTextArea a1 = new JTextArea();
        a1.setBounds(100,100,400,200);
        c.add(a1);

        a1.setText("shubham is good boy ");
        a1.setFont(new Font("Arial",Font.BOLD,18));
       // a1.setEditable(false);
       
        a1.setLineWrap(true);
        jf.setVisible(true);

    }
}