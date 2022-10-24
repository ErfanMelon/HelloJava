/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import javax.swing.AbstractButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Vatar
 */
public class JavaApplication2 {

    public static void main(String[] args) {
//        // TODO code application logic here
        try{
            String name = JOptionPane.showInputDialog("Enter your name");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        String msg="";
        if (age<15) { 
            msg=name+ " You are under 15";
        }
        else
        {
            msg=name+ " You are above 15";
                    }
        JOptionPane.showMessageDialog(new AbstractButton() {
        }, msg);
            
        }catch(Exception x){
//            main(null);// age is invalid
        }

        
    }

}
