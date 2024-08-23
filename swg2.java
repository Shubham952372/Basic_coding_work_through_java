import javax.swing.*;
import java.awt.*;

class swg2{
    public static void main(String [] args)
    {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,500);
        Container c=frame.getContentPane();

        c.setLayout(null); 
        JLabel label = new JLabel("password");
        label.setBounds(100,50,400,30);
       // Font font = new Font("Arial",Font.PLAIN ,30);
        //label.setFont(font);

       // ImageIcon icon = new ImageIcon("shubham");
       // JLabel label = new JLabel(icon);

        label.setBounds(100,50,200,30);
         c.add(label);
    }
}
