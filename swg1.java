import javax.swing.*;
import java.awt.*;
class swg1{
    public static void main(String []args)
    {
        JFrame frame= new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(700,500);
        frame.setLocation(100,50);
        //frame.setBounds(100,100,1000,500);
        frame.setTitle("shubham");

        ImageIcon icon = new ImageIcon("image.png");
        frame.setIconImage(icon.getImage());

        Container c = frame.getContentPane();
      //  Color color = new Color(255,0,0); // user can make their own color background color
        c.setBackground(Color.GREEN);

        frame.setResizable(false);



    }
}