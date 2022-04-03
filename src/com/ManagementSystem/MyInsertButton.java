package com.ManagementSystem;



import com.mysql.cj.util.StringUtils;
import com.sun.org.apache.bcel.internal.generic.Select;
import javafx.scene.control.DatePicker;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.font.TextAttribute;
import java.text.AttributedString;
import java.text.ParseException;
import java.util.Properties;


import javax.swing.*;

public class MyInsertButton extends JFrame implements ActionListener{

    JButton b1,b2;
    TextField t1,t2,t3,t4,t5;
    JLabel ln;
    JRadioButton rb1,rb2;
    JComboBox jc1,dd,mm,yy,dd2,mm2,yy2,jc3,jc4;


    MyInsertButton()
    {


        setBounds(0,0,1366,768);


        setLayout(null);

        ImageIcon im=new ImageIcon(ClassLoader.getSystemResource("com/ManagementSystem/Images/rect834.png"));
        ln=new JLabel(im);
        ln.setBounds(0,0,1366,786);
        add(ln);


        JLabel l=new JLabel("      Enter Your Details");
        l.setBounds(600,20,300,60);
        l.setForeground(Color.BLUE);
        l.setFont(new Font("serif",1,20));
        //l.set(Color.blue);
        ln.add(l);

       /* JLabel l=new JLabel("Enter Your Details");
        l.setBounds(250,50,200,20);
        ln.add(l);*/

        JLabel l1=new JLabel("Adhar card Number");
        //l1.setForeground(Color.magenta);
        l1.setBounds(500,100,200,20);
        ln.add(l1);

        JLabel l2=new JLabel("Name");
        l2.setBounds(500,150,100,20);
        ln.add(l2);

        JLabel l3=new JLabel("Nationality");
        l3.setBounds(500,200,100,20);
        ln.add(l3);

        JLabel l4=new JLabel("Gender");
        l4.setBounds(500,250,100,20);
        ln.add(l4);

        JLabel l5=new JLabel("DOB");
        l5.setBounds(500,300,100,20);
        ln.add(l5);

        JLabel l6=new JLabel("Source");
        l6.setBounds(500,350,100,20);
        ln.add(l6);

        JLabel l7=new JLabel("Destination");
        l7.setBounds(500,400,100,20);
        ln.add(l7);

        JLabel l8=new JLabel("Date Of Journey");
        l8.setBounds(500,450,100,20);
        ln.add(l8);

        JLabel l9=new JLabel("Contact Number");
        l9.setBounds(500,500,100,20);
        ln.add(l9);

        JLabel l10=new JLabel("Address");
        l10.setBounds(500,550,100,20);
        ln.add(l10);




        t1=new TextField();
        t1.setBounds(750,100,145,20);
        ln.add(t1);

        t2=new TextField();
        t2.setBounds(750,150,145,20);
        ln.add(t2);

        String dplistnat[]={"Select Nationality","Indian","NRI"};
        jc1=new JComboBox(dplistnat);
        jc1.setBackground(Color.white);
        jc1.setBounds(750,200,145,20);
        ln.add(jc1);

        rb1=new JRadioButton("Male");
        rb1.setBackground(Color.white);
        rb1.setBounds(750,250,70,20);
        ln.add(rb1);
        

        rb2=new JRadioButton("Female");
        rb2.setBackground(Color.white);
        rb2.setBounds(820,250,75,20);
        ln.add(rb2);

       // SwingUtilities

        t3=new TextField();
        t3.setBounds(750,500,145,20);
        ln.add(t3);

        t4=new TextField();
        t4.setBounds(750,550,145,20);
        ln.add(t4);



      /*  t5=new TextField();
        t5.setBounds(350,350,100,20);
        ln.add(t5);*/

        Integer[] ddv=new Integer[32];
        for(int i=0;i<31;i++)
        {
            ddv[i]=i+1;
        }

        dd=new JComboBox(ddv);
        dd.setBackground(Color.white);
        dd.setBounds(750,300,40,20);
        ln.add(dd);

        String mmv[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        mm=new JComboBox(mmv);
        mm.setBackground(Color.white);
        mm.setBounds(790,300,50,20);
        ln.add(mm);

        Integer[] yyv=new Integer[152];
        int x=2022;
        for(int i=0;i<150;i++)
        {
            yyv[i]=x;
            x--;
        }

        yy=new JComboBox(yyv);
        yy.setBackground(Color.white);
        yy.setBounds(840,300,55,20);
        ln.add(yy);


        String jc3v[]={"Select Source","Agartala","Agra","Amritsar","Bangalore","Bagdogra","Bhavnagar","Chandigarh","Coimbatore","Goa","Gorakhpur","Gwalior","Guwahati","Hubli","Jabalpur","Jodhpur","Kochi","Kozhikode","Ludhiana","Madurai","Manglore","Mumbai","Nagpur","New Delhi","Port Blair","Prayagraj","Rajkot","Shillong","Shimla","Srinagar","Triuchirappali","Vijaywada",};
        jc3=new JComboBox(jc3v);
        jc3.setBackground(Color.white);
        jc3.setBounds(750,350,145,20);
        ln.add(jc3);

        String jc4v[]={"Select Destination","Agartala","Agra","Amritsar","Bangalore","Bagdogra","Bhavnagar","Chandigarh","Coimbatore","Goa","Gorakhpur","Gwalior","Guwahati","Hubli","Jabalpur","Jodhpur","Kochi","Kozhikode","Ludhiana","Madurai","Manglore","Mumbai","Nagpur","New Delhi","Port Blair","Prayagraj","Rajkot","Shillong","Shimla","Srinagar","Triuchirappali","Vijaywada",};
        jc4=new JComboBox(jc4v);
        jc4.setBackground(Color.white);
        jc4.setBounds(750,400,145,20);
        ln.add(jc4);


        Integer[] ddv2=new Integer[32];
        for(int i=0;i<31;i++)
        {
            ddv2[i]=i+1;
        }

        dd2=new JComboBox(ddv2);
        dd2.setBackground(Color.white);
        dd2.setBounds(750,450,40,20);
        ln.add(dd2);

        String mmv2[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        mm2=new JComboBox(mmv2);
        mm2.setBackground(Color.white);
        mm2.setBounds(790,450,50,20);
        ln.add(mm2);

        Integer[] yyv2=new Integer[3];
        int x2=2022;
        for(int i=0;i<2;i++)
        {
            yyv2[i]=x2;
            x2--;
        }

        yy2=new JComboBox(yyv2);
        yy2.setBackground(Color.white);
        yy2.setBounds(840,450,55,20);
        ln.add(yy2);



        b1=new JButton("Submit");
        b1.setBounds(550,625,80,30);
        ln.add(b1);

        b2=new JButton("Back");
        b2.setBounds(750,625,80,30);
        ln.add(b2);

        setVisible(true);

        b1.addActionListener(this);
        b2.addActionListener(this);
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

//    chars[i]=='@'||chars[i]=='%'||chars[i]=='$'||chars[i]=='&'||chars[i]=='!'||chars[i]=='#'

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
            String pas=t1.getText();
            String nam=t2.getText();
            String nat=jc1.getSelectedItem().toString();

            String gen=null;
            if(rb1.isSelected())
                gen = "M";
            else if(rb2.isSelected())
                gen="F";

            String dob1=(dd.getSelectedItem()).toString();
            String dob2=(String) mm.getSelectedItem();
            String dob3=(yy.getSelectedItem()).toString();
            String dob=dob1+" "+dob2+" "+dob3;


            String sou=(String) jc3.getSelectedItem();
            String des=(String) jc4.getSelectedItem();

            String doj1=(dd2.getSelectedItem()).toString();
            String doj2=(String) mm2.getSelectedItem();
            String doj3=(yy2.getSelectedItem()).toString();
            String doj=doj1+" "+doj2+" "+doj3;


            String con=t3.getText();
            String add=t4.getText();

            String pnr="PN"+pas;
            String sta="Confirmed";


           /* AttributedString as=new AttributedString(pnr);
            as.addAttribute(TextAttribute.FOREGROUND,Color.yellow);*/


            /*String id = t1.getText();
            String source = t2.getText();
            String dest = t3.getText();
            String arr = t4.getText();
            String dept = t5.getText();*/


            if(pas.isEmpty()||nam.isEmpty()||con.isEmpty()||add.isEmpty()||sou=="Select Source"||des=="Select Destination"||nat=="Select Nationality"||gen==null)
            {
                JOptionPane.showMessageDialog(null,"Please Enter Value ....");
            }



            /*StringBuilder sb=new StringBuilder();
*/

            /*
            else if(StringUtils.isValidIdChar(na))
            {

            }*/



            //else if(con.())
            else if(checkDigi1(pas))
            {
                JOptionPane.showMessageDialog(null,"You Entered wrong value in PassPort Number");
            }
            else if(checkDigi(nam))
            {
                JOptionPane.showMessageDialog(null,"You Entered wrong value in name");
            }

              else if(!StringUtils.isStrictlyNumeric(con))
            {
                JOptionPane.showMessageDialog(null,"Sorry, Only Numeric Value is allowed in Contact Number");
            }

              else if(con.length()!=10)
            {
                JOptionPane.showMessageDialog(null,"Sorry, Your Contact Number is not 10 digit");
            }

              else if(sou==des)
            {
                JOptionPane.showMessageDialog(null,"Your Source and Destination can not be same");
            }

            else {

                Conn c = new Conn();

                String str = "insert into db values('" + pas + "','" + nam + "','" + nat + "','" + gen + "','" + dob + "','" + sou + "','" + des + "','" + doj + "','" + con + "','" + add + "','" + pnr + "','" + sta + "')";

                try {
                    c.s.executeUpdate(str);
                    JOptionPane.showMessageDialog(null, "Congratulations, Your Ticket Booked Successfully.\nPlease! note down your PNR Number for further references.\nPNR Number:   "+pnr);
                    this.setVisible(false);
                    new MyInsertButton();
                } catch (Exception e) {
                    System.out.println(e);
                    JOptionPane.showMessageDialog(null,e.toString());
                }


                /*t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                jc1.setSelectedItem("Select Nationality");
                jc3.setSelectedItem("Select Source");
                jc4.setSelectedItem("Select Destination");
                //jc3.setSelectedItem("select");
                //rb1.setSelected(false);
                //rb2.setSelected(false);

                 */



            }
        }

        else if(ae.getSource()==b2)
        {
            new ManagementSystem();
            this.setVisible(false);

        }



    }

    public static void main(String args[])
    {
        new MyInsertButton();
    }
}
