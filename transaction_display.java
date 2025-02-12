import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;
public class transaction extends JFrame implements ActionListener
{
   JFrame J;
   JTextField t1;
   JPasswordField t2;
   JButton b1;
   JLabel l1,l2,l3,l4,card,heading ;
    JRadioButton rb1,rb2,rb3,rb4;
    public transaction()
    {
      J=new JFrame("Transaction process");
      J.setSize(500,750);
     
       J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       
        heading=new JLabel("CREDIT CARD DETAILS");
       heading.setBounds(125,25,150,100);
       
       
       card=new JLabel("-----Select your card type-----");
       card.setBounds(110,75,200,100);
       
       rb1=new JRadioButton("MasterCard");
       rb1.setBounds(150,150,150,50);
       
       rb2=new JRadioButton("VisaCard");
       rb2.setBounds(150,200,150,50);
       
       rb3=new JRadioButton("AmericanExpress");
       rb3.setBounds(150,250,150,50);
       
       rb4=new JRadioButton("DiscoverCard");
       rb4.setBounds(150,300,150,50);
       
       ButtonGroup bg=new ButtonGroup();  
       
        rb1.addActionListener(this);
        rb2.addActionListener(this);
        rb3.addActionListener(this);
        rb4.addActionListener(this);
       bg.add(rb1);bg.add(rb2);   bg.add(rb3);bg.add(rb4); 
       l1=new JLabel(" Enter Card Number : ");
       l1.setBounds(90,350,125,25);
     
       l2=new JLabel("Enter CVV : ");
       l2.setBounds(90,400,125,25);
     

       t1=new JTextField(12);
       t1.setBounds(250,350,100,25);
       
       t2=new JPasswordField(3);
       t2.setBounds(250,400,100,25);
       

       b1=new JButton("CLICK");
       
       b1.addActionListener(this);
       
       b1.setBounds(155,500,85,75);
       J.add(rb1);
       J.add(rb2);
       J.add(rb3);
       J.add(rb4);
       J.add(heading);
       J.add(card);
       J.add(l1);
       J.add(l2);
       
       J.add(t1);
       J.add(t2);
   
      
       
       J.add(b1);
       
       J.setLayout(null);
       J.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        String S1=t1.getText();
        String S2=t2.getText();
       
       
        if(e.getSource()==b1)
        {
            if(rb1.isSelected())
            {
              JOptionPane.showMessageDialog(this, "Your transaction made using MasterCard with Card number **** **** "+ S1.substring(8)+ " was successful. "+"\n"+ "Thank You for shopping with us"+"\n");
            }
           
             else if(rb2.isSelected())
            {
              JOptionPane.showMessageDialog(this, "Your transaction made using VisaCard with Card number **** **** "+ S1.substring(8)+ " was successful. "+"\n"+ "Thank You for shopping with us"+"\n");
            }
           
             else if(rb3.isSelected())
            {
              JOptionPane.showMessageDialog(this, "Your transaction made using AmericanExpress Card with Card number **** **** "+ S1.substring(8)+ " was successful. "+"\n"+ "Thank You for shopping with us"+"\n");
            }
           
             else if(rb4.isSelected())
            {
              JOptionPane.showMessageDialog(this, "Your transaction made using Discover Card with Card number **** **** "+ S1.substring(8)+ " was successful. "+"\n"+ "Thank You for shopping with us"+"\n");
            }
        }
    
    }
}
class tester
{
    public static void main(String[] args)
    { transaction t = new transaction();
    }    
}
