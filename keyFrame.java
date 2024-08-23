import javax.swing.*;
import java.awt.*;
import java.awt.event.*;    
 

class keyFrame extends JFrame implements KeyListener{
Label l;    
TextArea area;  

keyFrame() {


    Container c = getContentPane();
    c.setLayout(null);
       
      setSize(300,300);  
      setTitle("KeyEvents");
      setLayout(null);  
      setVisible(true);  
      l = new Label();    
      l.setBounds (20, 50, 100, 20);    
       area = new TextArea();    
       area.setBounds (20, 80, 100, 150);      

       c.add(l);  
        c.add(area);  
         area.addKeyListener(this);    
   

}
    public void keyTyped(KeyEvent e) {    
        l.setText ("Key typed");
//area.setForeground(Color.red);
//l.setForeground(Color.red);
    }    
    public void keyPressed(KeyEvent e) {    
        l.setText ("Key Pressed");
//area.setForeground(Color.green);
//l.setForeground(Color.red);
    }    
    public void keyReleased (KeyEvent e) {    
        l.setText ("Key released");
   //area.setForeground(Color.pink);
   //l.setForeground(Color.red);
    }      
 

public static void main(String args[]) {  
keyFrame f = new keyFrame();      
}  
}    