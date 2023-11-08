package org.example.test;


import org.example.entity.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {

        Connection con = null;
        Statement statement = null;
        ResultSet rs = null;

        List<Employee> empList = new ArrayList<Employee>();

        try {
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "root");
            statement = con.createStatement();
            rs = statement.executeQuery("select * from employee");

            while (rs.next()){
                Employee emp = new Employee();
                emp.setEno(rs.getInt("ENO"));
                emp.setEname(rs.getString("ENAME"));
                emp.setEsal(rs.getFloat("ESAL"));
                emp.setEaddr(rs.getString("EADDR"));
                empList.add(emp);
            }

            for(Employee emp1: empList){
                System.out.println(emp1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
