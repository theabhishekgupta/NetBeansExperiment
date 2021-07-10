/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.abhisheklive.gui;

import java.awt.Color;
import java.awt.Frame;
import java.util.Date;

/**
 *
 * @author Lenovo India
 */
public class Example2 {
    public static void main(String[] args) {
        Frame f1 =new Frame();
        f1.setVisible(true);
        Date d1= new Date();
        Color c1= new Color(255,255 ,0);
        f1.setBackground(c1);
        f1.setBounds(100,100,400,300);
    }
}
