/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.abhisheklive.gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.util.Date;

class MyFrame extends Frame{
    
    Button b1,b2;
    public MyFrame(String title){
        super(title); 
        setBounds(50,50,500,500);
        b1=new Button("change color");
        b2=new Button("Quit");
        setLayout(new FlowLayout());
        add(b1);
        add(b2);
        
        setVisible(true);
        
    }
    
}

public class Example3 {
    public static void main(String[] args) {
        Date d1 =new Date();
        
        MyFrame f1= new MyFrame(d1.toString());
        
    }
}
