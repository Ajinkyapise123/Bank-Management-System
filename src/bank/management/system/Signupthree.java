
package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

/**
 *
 * @author ajink
 */
public class Signupthree extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit , cancel;
    String formno;
    
    Signupthree(String formno){
        this.formno=formno;
        setLayout(null);
        JLabel l1 = new JLabel("Page:3 Account Details");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        l1.setBackground(Color.WHITE);
        add(l1);
        
        JLabel type = new JLabel("Account Type");
        type.setFont(new Font("Raleway",Font.BOLD,22));
        type.setBounds(100,140,200,40);
        add(type);
        
        
        r1 = new JRadioButton("Saving Account");
        r1.setBounds(100,180,250,20);
        r1.setBackground(Color.WHITE);
        add(r1);
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setBounds(350,180,250,20);
        r2.setBackground(Color.WHITE);
        add(r2);
        r3 = new JRadioButton("Current Account");
        r3.setBounds(100,220,250,20);
        r3.setBackground(Color.WHITE);
        add(r3);
        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setBounds(350,220,250,20);
        r4.setBackground(Color.WHITE);
        add(r4);
        
        ButtonGroup qw2 = new ButtonGroup();
        qw2.add(r1);
        qw2.add(r2);
        qw2.add(r3);
        qw2.add(r4);
        
        JLabel card = new JLabel("Card Nymber");
        type.setFont(new Font("Raleway",Font.BOLD,22));
        type.setBounds(100,300,200,30);
        add(card);
        
        JLabel number = new JLabel("XXXX-XXXX-XXXX-5996");
        number.setFont(new Font("Raleway",Font.BOLD,22));
        number.setBounds(330,300,300,30);
        add(number);
        
        JLabel carddetail = new JLabel("Your 16 digit Card Number");
        carddetail.setFont(new Font("Raleway",Font.BOLD,12));
        carddetail.setBounds(100,330,300,20);
        add(carddetail);
        
        JLabel pin = new JLabel("Pin");
        pin.setFont(new Font("Raleway",Font.BOLD,22));
        pin.setBounds(100,370,200,30);
        add(pin);
        
        JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway",Font.BOLD,22));
        pnumber.setBounds(330,370,300,30);
        add(pnumber);
        
        JLabel pindetail = new JLabel("Your 4 digit Pin Number");
        pindetail.setFont(new Font("Raleway",Font.BOLD,12));
        pindetail.setBounds(100,400,300,20);
        add(pindetail);
        
        JLabel services = new JLabel("Services Required:");
        services.setFont(new Font("Raleway",Font.BOLD,22));
        services.setBounds(100,450,300,22);
        add(services);
        
        c1 = new JCheckBox("ATM Card");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway",Font.BOLD,22));
        c1.setBounds(100,500,200,20);
        add(c1);
        
        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway",Font.BOLD,22));
        c2.setBounds(350,500,300,20);
        add(c2);
        
        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway",Font.BOLD,22));
        c3.setBounds(100,550,200,20);
        add(c3);
        
        c4 = new JCheckBox("Email and SMS Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway",Font.BOLD,22));
        c4.setBounds(350,550,300,20);
        add(c4);
        
        c5 = new JCheckBox("Check Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway",Font.BOLD,22));
        c5.setBounds(100,600,200,20);
        add(c5);
        
        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway",Font.BOLD,22));
        c6.setBounds(350,600,300,20);
        add(c6);
        
        c7 = new JCheckBox("I hereby declare above information is correct");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway",Font.BOLD,22));
        c7.setBounds(100,680,600,30);
        add(c7);
        
        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway",Font.BOLD,14));
        submit.setBounds(230,720,100,30);
        submit.addActionListener(this);
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway",Font.BOLD,14));
        cancel.setBounds(420,720,100,30);
        cancel.addActionListener(this);
        add(cancel);
        
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850,820);
        setLocation(350,0);
        setVisible(true);
        
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
            String accountType =null;
            if(r1.isSelected()){
                accountType ="Saving Account";
            }else if(r2.isSelected()){
                accountType ="Fixed Deposit Account";
            }else if(r3.isSelected()){
                accountType ="Current Account";
            }else if(r4.isSelected()){
                accountType ="Reccuring Deposit Account";
            }
            
            Random random =new Random();
            String cardnumber="" +Math.abs((random.nextLong() % 90000000L) + 504093600000000L);
            String pinnumber="" +Math.abs((random.nextLong() % 9000L) + 1000L);
            String facility =""; 
            if (c1.isSelected()){
                facility = facility +" ATM Card";
                }
            else if (c2.isSelected()){
                facility = facility +" Internet Banking";
                }
            else if (c3.isSelected()){
                facility = facility +" Mobile Banking";
                }
            else if (c4.isSelected()){
                facility = facility +" Emails and SMS Alerts";
                }
            else if (c5.isSelected()){
                facility = facility +" Check Book";
                }
            else if (c6.isSelected()){
                facility = facility +"E-Statement";
                }
            
            try{
                if (accountType.equals("")){
                    JOptionPane.showMessageDialog(null, "Account Tpye is required");
                } else{
                    Conn conn =new Conn();
                    String query1 = "insert into signupthree values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                    String query2 = "insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
                    conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query2);
                    JOptionPane.showMessageDialog(null, "Card Number: "+cardnumber + "\n Pin Number: "+pinnumber);
                }
                    setVisible(false);
                    new Deposit(pinnumber).setVisible(false);
                
            }catch(Exception e){
                System.out.println(e);
            }
            
            
        }
        else if (ae.getSource()==cancel){
        setVisible(false);
        new Login().setVisible(true);
        }
    }
    
    public static void main(String args[]){
        new Signupthree("");
            
        
    }
}
