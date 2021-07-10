/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.abhisheklive.gui;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Lenovo India
 */

class MyFrame3 extends Frame {
    Button b1;
    
    public MyFrame3(String Fname){
        
        super(Fname);
        setBounds(50,50,500,500);
        Color c1 =new   Color(255,255,0);
        setBackground(c1);
        FlowLayout l1 = new FlowLayout(); 
        setLayout(l1);
        b1=new Button("Quit");
        CloseFrame cf =new CloseFrame();
        b1.addActionListener(cf);// registration event source to event listener 
        add(b1);
        setVisible(true);
}
    
}

class CloseFrame implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
    
    
    
}

public class Example4 {
    public static void main(String[] args) {
        MyFrame3 f1 =new MyFrame3("abhishek's frame");
     }
    
} 
