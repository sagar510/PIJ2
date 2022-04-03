package com.ManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CEO extends JFrame {
    JButton b;
    JLabel l,l1,ceo1,ceo2,ceo3,ceo4,ceo5,ceo6;
    JLabel n1,n2,n3,n4,n5,n6;
    CEO() {
        setBounds(0,0,1366,768);
        setLayout(null);

        ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("com/ManagementSystem/Images/1366x768-white-solid-color-background.jpg"));
        l1=new JLabel(i);
        l1.setBounds(0,0,1350,768);
        add(l1);

        l=new JLabel("                                             CEO's of BINGO Airlines");
        l.setBounds(0,50,1368,60);
        // l.setForeground(Color.MAGENTA);
        l.setAlignmentX(Component.CENTER_ALIGNMENT);
        l.setFont(new Font("serif",1,40));
        // l.set(Color.blue);
        l1.add(l);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("com/ManagementSystem/Images/ceo1.png"));
        ceo1=new JLabel(i1);
        ceo1.setBounds(200,150,200,200);
        l1.add(ceo1);

        n1=new JLabel("                  Utsav Kumar");
        n1.setBounds(200,360,200, 20);
        l1.add(n1);


        ImageIcon i2=new ImageIcon(ClassLoader.getSystemResource("com/ManagementSystem/Images/ceo2.png"));
        ceo2=new JLabel(i2);
        ceo2.setBounds(600,150,200,200);
        l1.add(ceo2);

        n2=new JLabel("                Jitendra Singh");
        n2.setBounds(600,360,200, 20);
        l1.add(n2);

        ImageIcon i3=new ImageIcon(ClassLoader.getSystemResource("com/ManagementSystem/Images/ceo3.png"));
        ceo3=new JLabel(i3);
        ceo3.setBounds(1000,150,200,200);
        l1.add(ceo3);

        n3=new JLabel("                 Yashpal Singh");
        n3.setBounds(1000,360,200, 20);
        l1.add(n3);


        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("com/ManagementSystem/Images/ceo4.png"));
        ceo4=new JLabel(i4);
        ceo4.setBounds(200,400,200,200);
        l1.add(ceo4);

        n4=new JLabel("                 Vasavi P");
        n4.setBounds(200,610,200, 20);
        l1.add(n4);

        /*ImageIcon i5=new ImageIcon(ClassLoader.getSystemResource("com/ManagementSystem/Images/ceo5.png"));
        ceo5=new JLabel(i5);
        ceo5.setBounds(600,400,200,200);
        l1.add(ceo5);*/

        n5=new JLabel("                    ");
        n5.setBounds(600,610,200, 20);
        l1.add(n5);

        /*ImageIcon i6=new ImageIcon(ClassLoader.getSystemResource("com/ManagementSystem/Images/ceo6.png"));
        ceo6=new JLabel(i6);
        ceo6.setBounds(1000,400,200,200);
        l1.add(ceo6);*/

        n6=new JLabel("                     ");
        n6.setBounds(1000,610,200, 20);
        l1.add(n6);

        /*ImageIcon i3=new ImageIcon(ClassLoader.getSystemResource("com/ManagementSystem/Images/ceo3.png"));
        ceo3=new JLabel(i3);
        ceo3.setBounds(200,200,200,200);
        l1.add(ceo3);*/


        b=new JButton("Next");
        b.setFont(new Font("serif",1,20));
        b.setBounds(1200,650,100,40);
        b.setBackground(Color.black);
        b.setForeground(Color.yellow);
        l1.add(b);
        setVisible(true);
        b.addActionListener(this::actionPerformed);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
    {
        new ManagementSystem();
        this.setVisible(false);
    }

    public static void main(String[] args) {
        new CEO();
    }

}
