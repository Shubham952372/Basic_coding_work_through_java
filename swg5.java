import javax.swing.*;
import java.awt.*;

class swg5{
    public static void main(String args []){
        JFrame jf = new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(100,100,1000,500);
        Container c = jf.getContentPane();
        c.setLayout(null);

        JButton b1 = new  JButton("click on");
        b1.setSize(200,50);
        b1.setLocation(160,40);
        c.add(b1);

        Font font = new Font("Arial",Font.BOLD,30);
        b1.setFont(font);

        b1.setText("click_on");

        b1.setForeground(Color.RED);
        b1.setBackground(Color.GREEN);

        Cursor c1=new Cursor(Cursor.HAND_CURSOR);
       // Cursor c2 =new Cursor (Cursor.CROSSHAIR_CURSOR);
        //Cursor c3 = new Cursor (Cursor.WAIT_CURSOR);
        b1.setCursor(c1);

        b1.setEnabled(false);
        b1.setVisible(false);
        

        jf.setVisible(true);

    }
}