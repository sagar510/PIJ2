package com.ManagementSystem;

import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import net.proteanit.sql.*;

public class MyPrintButton extends JFrame implements ActionListener {
    JTable t;
    JButton b;
    JLabel l;
    Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;

    MyPrintButton()
    {
        setBounds(0,0,1366,768);


        setLayout(null);

        ImageIcon im=new ImageIcon(ClassLoader.getSystemResource("com/ManagementSystem/Images/rect834.png"));
        l=new JLabel(im);
        l.setBounds(0,0,1366,786);
        add(l);

        JLabel h=new JLabel("        All Tickets");
        h.setBounds(600,20,300,40);
        h.setForeground(Color.BLUE);
        h.setFont(new Font("serif",1,20));
        //l.set(Color.blue);
        l.add(h);


        t=new JTable();
        t.setBounds(0,100,1366,500);
        l.add(t);

        b=new JButton("Back");
        b.setBounds(1200,650,80,30);
        l.add(b);
        b.addActionListener(this);

        l1=new Label("Adhar No.");
        l1.setFont(new Font("serif",1,14));
        l1.setBounds(0,75,113,20);
        l.add(l1);

        l2=new Label("Name");
        l2.setFont(new Font("serif",1,14));
        l2.setBounds(114,75,113,20);
        l.add(l2);

        l3=new Label("Nationality");
        l3.setFont(new Font("serif",1,14));
        l3.setBounds(228,75,113,20);
        l.add(l3);

        l4=new Label("Gender");
        l4.setFont(new Font("serif",1,14));
        l4.setBounds(342,75,113,20);
        l.add(l4);

        l5=new Label("Date of Birth");
        l5.setFont(new Font("serif",1,14));
        l5.setBounds(456,75,113,20);
        l.add(l5);

        l6=new Label("Source");
        l6.setFont(new Font("serif",1,14));
        l6.setBounds(570,75,113,20);
        l.add(l6);

        l7=new Label("Destination");
        l7.setFont(new Font("serif",1,14));
        l7.setBounds(683,75,113,20);
        l.add(l7);

        l8=new Label("Date of Journey");
        l8.setFont(new Font("serif",1,14));
        l8.setBounds(797,75,113,20);
        l.add(l8);

        l9=new Label("Contact No.");
        l9.setFont(new Font("serif",1,14));
        l9.setBounds(911,75,113,20);
        l.add(l9);

        l10=new Label("Address");
        l10.setFont(new Font("serif",1,14));
        l10.setBounds(1025,75,113,20);
        l.add(l10);

        l11=new Label("PNR Number");
        l11.setFont(new Font("serif",1,14));
        l11.setBounds(1139,75,113,20);
        l.add(l11);

        l12=new Label("Status");
        l12.setFont(new Font("serif",1,14));
        l12.setBounds(1253,75,113,20);
        l.add(l12);

        setVisible(true);


        Conn c=new Conn();
        String str="select * from db";

        try {
            ResultSet rs = c.s.executeQuery(str);
            t.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (Exception e)
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(null,e.toString());
        }
    }


    public void actionPerformed(ActionEvent ae)
    {
        new ManagementSystem();
        this.setVisible(false);
    }

    public static void main(String args[])
    {
        new MyPrintButton();
    }

}
