package com.companyname.bank;

import java.sql.*;

/**
 * @description:
 * @author:
 * @create: 2021-01-01 18:21
 **/
public class MySQLDemo {

    // JDBC 驱动名及数据库 URL
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/RUNOOB?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";

    static final String USER= "root";
    static final String PASSWORD ="123456";

    public static void main(String[] args){
        Connection conn = null;
        Statement stmt = null;
        try {
            //注册驱动
            Class.forName(JDBC_DRIVER);
            System.out.println("连接数据库...");
            conn = DriverManager.getConnection(DB_URL,USER,PASSWORD)


        }catch(SQLException se){
            // 处理 JDBC 错误
            se.printStackTrace();
        }catch(Exception e){
            // 处理 Class.forName 错误
            e.printStackTrace();
        }

    }


}
