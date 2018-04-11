/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoAnHa;

/**
 *
 * @author pc
 */

import java.awt.event.*;
import javax.swing.*;

public class VeDoThi implements ActionListener{
    
    JFrame f;
    JTextField tf1, tf2, tf3, tf4;
    JLabel lb1, lb2, lb3, lb4;
    JButton bt1, bt2;
    
    public VeDoThi(){
        
        f = new JFrame("Ve do thi");
        f.setLayout(null);
        f.setSize(300,350);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        lb1 = new JLabel("Du lieu 1");
        lb1.setBounds(20, 20, 50, 25);
        
        tf1 = new JTextField(10);
        tf1.setBounds(90, 20, 100, 25);
        
        lb2 = new JLabel("Du lieu 2");
        lb2.setBounds(20, 65, 50, 25);
        
        tf2 = new JTextField(10);
        tf2.setBounds(90, 65, 100, 25);
    
        lb3 = new JLabel("Du lieu 3");
        lb3.setBounds(20, 110,50,25);
        
        tf3 = new JTextField(10);
        tf3.setBounds(90,110,100,25);
        
        lb4 = new JLabel("Du lieu 4");
        lb4.setBounds(20,155,50,25);
        
        tf4 = new JTextField(10);
        tf4.setBounds(90,155,100,25);
     
        bt1 = new JButton("Ve do thi");
        bt1.setBounds(20,200,100,25);
        
        bt2 = new JButton("Thoat");   
        bt2.setBounds(20,245,100,25);

        
        f.add(lb1);
        f.add(tf1);
        f.add(lb2);
        f.add(tf2);
        f.add(lb3);
        f.add(tf3);
        f.add(lb4);
        f.add(tf4);
        f.add(bt1);
        f.add(bt2);
        
        bt1.addActionListener(this);
        bt2.addActionListener(this);
    } 

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource()==bt1){
            
            if (isNumeric(tf1.getText())==false||isNumeric(tf2.getText())==false||
                isNumeric(tf3.getText())==false||isNumeric(tf4.getText())==false){
                
                JOptionPane.showMessageDialog(f, "Khong xac dinh duoc du lieu. Moi ban nhap lai!");
            }
            else{
                double height1 = Double.parseDouble(tf1.getText());
                double height2 = Double.parseDouble(tf2.getText());
                double height3 = Double.parseDouble(tf3.getText());
                double height4 = Double.parseDouble(tf4.getText());
                
                JFrame dothi = new JFrame("Do thi");
                dothi.setSize(380,350);
                dothi.setVisible(true);
 
                DoThi d = new DoThi(30, (int) Math.round(250-height1),50,height1,
                                    110,(int) Math.round(250-height2),50,height2,
                                    190,(int) Math.round(250-height3),50,height3,
                                    270,(int) Math.round(250-height4),50,height4,
                                    30,270,
                                    110,270,
                                    190,270,
                                    270,270);
                
                dothi.add(d);
   
            }
        }
        
        if (e.getSource()==bt2){
            System.exit(0);
        }
    }
    
    public static boolean isNumeric(String s){
        try{
            double a = Double.parseDouble(s);
        }
        catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }
}
