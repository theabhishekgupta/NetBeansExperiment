/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.abhisheklive.assignments;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 *
 * @author Lenovo India
 */
class Frame01 extends Frame implements ActionListener{
    Button b1 ,b2 ,b3;
    int count=0;
    public Frame01(String Fname){
        
        super(Fname);
        
        FlowLayout l1 = new FlowLayout(); 
        setLayout(l1);
        b1=new Button("Increment");
        b3=new Button("Quit");
        b2= new Button("Decrement");
        add(b1);
        add(b2);
        add(b3);
        b1.addActionListener(this);// registration event source to event listener and pass the arg (jis class ne actionPerfomed ko override kiya hua hai )
        b2.addActionListener(this);
        b3.addActionListener(this);
        setBounds(50,50,500,500);
        setVisible(true);
}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b3){
            System.exit(0);
        }
        else{
            count=e.getSource()==b1?count+1:count-1;
            setTitle(String.valueOf(count));
        }
        
       
    }
}

public class Assignment01 {
    public static void main(String[] args) {
        Frame01 f1 =new Frame01("0"); 
    }
    
}
