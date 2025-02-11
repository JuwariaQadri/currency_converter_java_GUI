import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.String;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 
import javax.swing.JButton;
import javax.swing.JFrame;
public class converter extends JFrame implements ActionListener
{

    JFrame J =new JFrame("Converter");
    JLabel l1=new JLabel("Currency Converter");
     JLabel l2=new JLabel("Select the input currency");
      JLabel l3=new JLabel("Enter the amount ");
       JLabel l4=new JLabel("Select the output currency ");
       
       JButton b1=new JButton("Convert");
        JLabel l5=new JLabel("Converted amount");
        
        JButton b2=new JButton("Clear");
        
        JTextField t1=new JTextField(20);
        JTextField t2=new JTextField(20);
        JTextField t3=new JTextField(20);
        JTextField t4=new JTextField(20);
        JTextField t5=new JTextField(20);
        JTextField t6=new JTextField(20);
     converter()
     {
        J.setVisible(true);
        J.setLayout(new FlowLayout());
        J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        J.setSize(400,400);
        J.add(l1);
        J.add(l2);
        J.add(l3);
        J.add(l4);
        J.add(l5);
        J.add(b1);
        J.add(b2);
        J.add(t1);
        J.add(t2);
        J.add(t3);
        J.add(t4);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
    
} b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                // Converting to double
                double d
                    = Double.parseDouble(t1.getText());
  
                // Converting rupees to dollars
                double d1 = (d / 65.25);
  
                // Getting the string value of the calculated value
                String str1 = String.valueOf(d1);
  
                // Placing it in the text box
                t2.setText(str1);
            }
        });
  
        // Adding action listener
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                // Converting to double
                double d2
                    = Double.parseDouble(t2.getText());
  
                // converting Dollars to rupees
                double d3 = (d2 * 65.25);
  
                // Getting the string value of the
                // calculated value
                String str2 = String.valueOf(d3);
  
                // Placing it in the text box
                t1.setText(str2);
            }
        });
  
}
