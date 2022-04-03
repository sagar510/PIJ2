package com.ManagementSystem;
import javafx.geometry.VerticalDirection;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;


public class ManagementSystem extends JFrame implements ActionListener{

    JLabel l;
    Button b6;
    JButton b1,b2,b3,b4,b5;

    ManagementSystem()
    {
        setBounds(0,0,1366,768);



        setLayout(null);


        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("com/ManagementSystem/Images/pic3.jpg"));
        JLabel l1=new JLabel(i1);
        l1.setBounds(0,0,1366,768);
        add(l1);

        l=new JLabel("                                        BINGO Airline, Welcomes You");
        l.setBounds(0,50,1368,60);
       // l.setForeground(Color.MAGENTA);
        l.setAlignmentX(Component.CENTER_ALIGNMENT);
        l.setFont(new Font("serif",1,40));
       // l.set(Color.blue);
        l1.add(l);

        b1 = new JButton("Book a Ticket");
        b1.setBounds(485, 300, 400, 40);
        b1.setFont(new Font("serif",0,20));
        l1.add(b1);

        b2 = new JButton("Cancel Your Ticket");
        b2.setBounds(485, 370, 400, 40);
        b2.setFont(new Font("serif",0,20));
        l1.add(b2);

        b3 = new JButton("Update Your Details");
        b3.setBounds(485, 440, 400, 40);
        b3.setFont(new Font("serif",0,20));
        l1.add(b3);

        b4 = new JButton("View All Tickets");
        b4.setBounds(485, 510, 400, 40);
        b4.setFont(new Font("serif",0,20));
        l1.add(b4);

        b5 = new JButton("Exit");
        b5.setBounds(485, 580, 400, 40);
        b5.setFont(new Font("serif",0,20));
        l1.add(b5);

        b6=new Button("Login");
        b6.setBounds(150,250,100,20);
       // add(b6);
        setVisible(true);


        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1) {
            new MyInsertButton();
            this.setVisible(false);
        }
        else if(e.getSource()==b2)
        {
            new MyDeleteButton();
           // this.setVisible(false);
        }
        else if(e.getSource()==b3)
        {
            new MyUpdateButton();
            //this.setVisible(false);
        }
        else if(e.getSource()==b4)
        {
            new MyPrintButton();
            this.setVisible(false);
        }
        else if(e.getSource()==b5)
        {
            System.exit(0);
        }
        else if(e.getSource()==b6)
        {
            new Login();
            this.setVisible(false);
        }
    }

    public static void main(String args[])
    {
        new ManagementSystem();
    }
}
