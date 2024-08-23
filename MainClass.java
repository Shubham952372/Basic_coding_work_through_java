package mypack ;
// import pack.*;
package pack;

import javax.swing.*;

public class MainClass {
    public static void main(String args[])
    {
        Myframe f = new Myframe();
        f.setTitle("null layout");
        f.setBounds(100,100,500,500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}