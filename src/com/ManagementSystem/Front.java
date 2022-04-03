package com.ManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.lang.*;

public class Front extends JFrame {
    JButton b;
    JLabel l,l1;
    Front()
    {
        setBounds(0,0,1366,768);


        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("com/ManagementSystem/Images/airplane.jpg"));
        l1=new JLabel(i1);
        l1.setBounds(0,0,1350,768);
        add(l1);

        l=new JLabel("              BINGO Airlines");
        l.setBounds(0,250,1000,60);
        l.setForeground(Color.yellow);
        l.setAlignmentX(Component.CENTER_ALIGNMENT);
        l.setFont(new Font("serif",1,60));
        // l.set(Color.blue);
        l1.add(l);

        b=new JButton("Next");
        b.setFont(new Font("serif",1,20));
        b.setBounds(1200,650,100,40);
        b.setBackground(Color.black);
        b.setForeground(Color.yellow);
        l1.add(b);
        setVisible(true);
        b.addActionListener(this::actionPerformed);

        while(true)
        {
            l.setVisible(false);
            try{
                Thread.sleep(500);
            }
            catch(Exception e)
            {

            }
            l.setVisible(true);
            try {
                Thread.sleep(500);
            }catch (Exception e)
            {

            }
        }
    }

    public void actionPerformed(ActionEvent ae)
    {
        new CEO();
        //this.setVisible(false);
    }


    public static void main(String args[])
    {
        new Front();
    }

}
