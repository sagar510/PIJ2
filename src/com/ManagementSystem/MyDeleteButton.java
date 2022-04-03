package com.ManagementSystem;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;

public class MyDeleteButton extends JFrame implements ActionListener{
    JButton b1,b2;
    JLabel l,l1,l2;
    TextField t;
    JOptionPane mess=new JOptionPane();

    MyDeleteButton()
    {
        setBounds(283,0,800,768);



        setLayout(null);

        ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("com/ManagementSystem/Images/border-template-with-white-airplane-vector-19520126.jpg"));
        l=new JLabel(i);
        l.setBounds(0,0,800,768);
        add(l);


        JLabel l1=new JLabel("               CANCEL TICKET");
        l1.setBounds(270,100,300,60);
        l1.setForeground(Color.BLUE);
        l1.setFont(new Font("serif",1,20));
        //l.set(Color.blue);
        l.add(l1);


        l2=new JLabel("Enter PNR Number");
        l2.setBounds(270,250,200,20);
        l.add(l2);

        t=new TextField();
        t.setBounds(470,250,100,20);
        l.add(t);

        b1=new JButton("Cancel");
        b1.setBounds(380,330,80,30);
        l.add(b1);

        b2=new JButton("Back");
        b2.setBounds(590,450,80,30);
        l.add(b2);



        b1.addActionListener(this);
        b2.addActionListener(this);


        setVisible(true);
    }

    public static boolean checkDigi1(String n)
    {

        char[] chars=n.toCharArray();
        int len=n.length();
        int i,count=0;
        for(i=0;i<len;i++)
        {
            if(chars[i]=='^'||chars[i]=='*'||chars[i]=='('||chars[i]==')'||chars[i]=='?'||chars[i]=='@'||chars[i]=='%'||chars[i]=='$'||chars[i]=='&'||chars[i]=='!'||chars[i]=='#')
            {
                count++;
                break;
            }
        }
        if(count==0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            try{
            String pnr=t.getText();


            Conn c=new Conn();
            String str1="select * from db where PNR_Number='"+pnr+"'";
            ResultSet rs=c.s.executeQuery(str1);


                if(pnr.isEmpty())
                {
                    mess.showMessageDialog(null,"Please Enter value");
                }
                else if(checkDigi1(pnr))
                {
                    mess.showMessageDialog(null,"Sorry, You Entered wrong value");
                }
                else if(rs.next()) {
                    String str2 = "delete from db where PNR_Number='" + pnr + "'";
                    c.s.executeUpdate(str2);
                    mess.showMessageDialog(null, "Your Ticket Cancelled Successfully");
                }
                else
                {
                    mess.showMessageDialog(null,"No Such PNR Number Found");
                }


            }catch (Exception e)
            {
                System.out.println(e);
                mess.showMessageDialog(null,e.toString());
            }

        }
        else if(ae.getSource()==b2) {
            new ManagementSystem();
            this.setVisible(false);
        }
    }



}
