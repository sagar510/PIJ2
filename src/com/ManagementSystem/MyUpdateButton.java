package com.ManagementSystem;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;

public class MyUpdateButton extends JFrame implements ActionListener{
    JButton b1,b2;
    JLabel l1,l2,l3,l4;
    JLabel l;
    TextField t1,t2;
    JComboBox jc;

    MyUpdateButton()
    {
        setBounds(283,0,800,768);


        setLayout(null);

        ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("com/ManagementSystem/Images/border-template-with-white-airplane-vector-19520126.jpg"));
        l=new JLabel(i);
        l.setBounds(0,0,800,768);
        add(l);

        JLabel l1=new JLabel("               UPDATE TICKET");
        l1.setBounds(270,100,300,60);
        l1.setForeground(Color.BLUE);
        l1.setFont(new Font("serif",1,20));
        //l.set(Color.blue);
        l.add(l1);

        l2=new JLabel("Enter PNR Number");
        l2.setBounds(270,200,200,20);
        l.add(l2);

        l3=new JLabel("What to Update?");
        l3.setBounds(270,250,200,20);
        l.add(l3);

        l4=new JLabel("Enter Updated Value");
        l4.setBounds(270,300,200,20);
        l.add(l4);


        t1=new TextField();
        t1.setBounds(470,200,150,20);
        l.add(t1);

        String str[]={"Select","Name","Date of Birth","Source","Destination","Date of Journey","Contact Number","Address"};
        jc=new JComboBox(str);
        jc.setBounds(470,250,150,20);
        l.add(jc);

        t2=new TextField();
        t2.setBounds(470,300,150,20);
        l.add(t2);

        b1=new JButton("Update");
        b1.setBounds(380,380,80,30);
        l.add(b1);

        b2=new JButton("Back");
        b2.setBounds(590,450,80,30);
        l.add(b2);

        setVisible(true);

        b1.addActionListener(this);
        b2.addActionListener(this);

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

    public static boolean checkDigi(String n)
    {

        char[] chars=n.toCharArray();
        int len=n.length();
        int i,count=0;
        for(i=0;i<len;i++)
        {
            if(Character.isDigit(chars[i])||chars[i]=='^'||chars[i]=='*'||chars[i]=='('||chars[i]==')'||chars[i]=='?'||chars[i]=='@'||chars[i]=='%'||chars[i]=='$'||chars[i]=='&'||chars[i]=='!'||chars[i]=='#')
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

            try
            {
                String identity=t1.getText();
                String updated_value=t2.getText();
                String wtu=(String) jc.getSelectedItem();
                String str;


                Conn c = new Conn();
                String str1="select * from db where PNR_Number='"+identity+"'";
                ResultSet rs=c.s.executeQuery(str1);


                if(identity.isEmpty() || updated_value.isEmpty()||wtu=="Select")
                {
                    JOptionPane.showMessageDialog(null,"Please! Enter Value");
                }
                else if(checkDigi1(identity))
                {
                    JOptionPane.showMessageDialog(null,"Sorry, You Entered wrong value in PNR");
                }
                else if(checkDigi1(updated_value))
                {
                    JOptionPane.showMessageDialog(null,"Sorry, You Entered wrong value in Updated Value in Updated value");
                }

                else if(rs.next()) {

                    if (wtu == "Name") {
                        str = "update db set Name='" + updated_value + "' where PNR_Number='" + identity + "'";
                        c.s.executeUpdate(str);
                    } else if (wtu == "Date of Birth") {
                        str = "update db set DOB='" + updated_value + "' where PNR_Number='" + identity + "'";
                        c.s.executeUpdate(str);
                    } else if (wtu == "Source") {
                        str = "update db set Source='" + updated_value + "' where PNR_Number='" + identity + "'";
                        c.s.executeUpdate(str);
                    } else if (wtu == "Destination") {
                        str = "update db set Destination='" + updated_value + "' where PNR_Number='" + identity + "'";
                        c.s.executeUpdate(str);
                    }
                    else if(wtu=="Date of Journey"){
                        str= "update db set Date_of_Journey='"+ updated_value +"' where PNR_Number='"+ identity + "'";
                        c.s.executeUpdate(str);
                    }
                    else if(wtu=="Contact Number"){
                        str= "update db set Contact_Number='"+ updated_value +"' where PNR_Number='"+ identity +"'";
                        c.s.executeUpdate(str);
                    }
                    else if(wtu=="Address"){
                        str=" update db set Address='"+ updated_value +"' where PNR_Number='"+ identity +"'";
                        c.s.executeUpdate(str);
                    }


                    JOptionPane.showMessageDialog(null, "Updated Successfully");
                }

                else
                {
                    JOptionPane.showMessageDialog(null,"No Such PNR Number Found");
                }
            }
            catch (Exception e)
            {
                System.out.println(e);
                JOptionPane.showMessageDialog(null,e.toString());


            }
        }
        else if(ae.getSource()==b2) {
            new ManagementSystem();
            this.setVisible(false);
        }
    }



}
