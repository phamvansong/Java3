/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

        /**
         *
         * @author pvsla
         */

public class DemoJDBC {

    public static void main(String[] args) throws ClassNotFoundException {
        try {
            //B1: Load drover
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            String dbUsername = "", //đăng nhập mặc định bằng quyền admin window thì thêm cái "integratedSecuriry=true"
                    dbPassword = "",//+ username = password = "";
                    dbUrl = "jdbc:sqlserver://localhost:1433;databasename=demo_jdbc;integratedSecurity=true";
            //B2: Tao connectinon
            Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
            
            String sql = "select * from uss";

            //B3: đóng gói truy vấn
            Statement statement = conn.createStatement();
            
           //B4: Thuc thi truy van
            ResultSet rs = statement.executeQuery(sql);
            
            //B5: Lay du lieu tu ResultSet
            while(rs.next()){
                System.out.println(rs.getString("name") + "-" + rs.getFloat("diem"));
            }
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
