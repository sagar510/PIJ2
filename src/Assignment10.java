package com.ManagementSystem;

import com.ManagementSystem.JDBC;

import java.sql.*;
import javax.swing.*;

import static java.lang.Class.forName;

public class Assignment10 extends JFrame{
    Assignment10()
    {

        Connection con;
        Statement st;
        ResultSet rs;
        String url="jdbc:mysql:///managementsystem";
        String driver="com.mysql.cj.jdbc.Driver";
        String user="root";
        String pass="Password";

        try {
            Class.forName(driver);
            con=DriverManager.getConnection(url,user,pass);
            con.setAutoCommit(false);
            st=con.createStatement();
            String sql="select * from Student";
            rs= st.executeQuery(sql);

            System.out.println("EmpID  Ename  Sal");

            while (rs.next())
            {
                System.out.print(rs.getString("Roll_no"));
                System.out.print("    ");
                System.out.print(rs.getString("Name"));
                System.out.print("   ");
                System.out.print(rs.getString("Department"));
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
