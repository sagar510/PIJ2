package com.ManagementSystem;

import java.sql.*;
import javax.swing.*;

import static java.lang.Class.forName;

public class JDBC extends JFrame{
    JDBC()
    {

        Connection con;
        Statement st;
        ResultSet rs;
        String url="jdbc:mysql:///managementsystem";
        String driver="com.mysql.cj.jdbc.Driver";
        String user="root";
        String pass="root";

        try {
            Class.forName(driver);
            con=DriverManager.getConnection(url,user,pass);
            con.setAutoCommit(false);
            st=con.createStatement();
            String sql="select * from emp";
            rs= st.executeQuery(sql);

            System.out.println("EmpID  Ename  Sal");

            while (rs.next())
            {
                System.out.print(rs.getString("empid"));
                System.out.print("    ");
                System.out.print(rs.getString("ename"));
                System.out.print("   ");
                System.out.print(rs.getString("sal"));
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }


    public static void main(String[] args) {
              new JDBC();
    }
}
