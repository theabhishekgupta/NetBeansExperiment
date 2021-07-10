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
import java.util.Random;

class MyFrame5 extends Frame implements ActionListener{
    Button b1 ,b2;
    Random rnd;
    
    public MyFrame5(String Fname){
        
        super(Fname);
        
        FlowLayout l1 = new FlowLayout(); 
        setLayout(l1);
        b1=new Button("Change Color");
        b2=new Button("Quit");
        rnd=new Random();
        add(b1);
        add(b2);
        b1.addActionListener(this);// registration event source to event listener and pass the arg (jis class ne actionPerfomed ko override kiya hua hai )
        b2.addActionListener(this);
        setBounds(50,50,500,500);
        setVisible(true);
}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b2){
            System.exit(0);
            
        }
        else
        {
            int red =rnd.nextInt(256);
            int green = rnd.nextInt(256);
            int blue =rnd.nextInt(256);
            Color c =new Color(red, green,blue);
            setBackground(c);
            
        }
       
    }
}
    



public class Example5 {
    public static void main(String[] args) {
        MyFrame5 f1= new MyFrame5("abhishek's frame");
    }
    
    
}
