package com.gr.visitServer;

/**
 * @description:
 * @create: 2021-02-10 17:30
 **/
package com.gr.visitServer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.gr.DBHerpel.DBHerpel;

public class VisitMySql {

    // 连接对象
    private Connection conn;
    // 传递sql语句
    private Statement stt;
    // 结果集
    private ResultSet set;

    // 查询
    public void Select() {
        try {
            // 获取连接
            conn = DBHerpel.getConnection();
            if (conn == null)
                return;
            // 定义sql语句
            String Sql = "select * from login";
            // 执行sql语句
            stt = conn.createStatement();
            // 返回结果集
            set = stt.executeQuery(Sql);
            // 获取数据
            while (set.next()) {

                System.out.println("用户名:" + set.getString(1) + "\t密码:"
                        + set.getString(2));

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            // 释放资源
            try {
                set.close();
                conn.close();
            } catch (Exception e2) {
                // TODO: handle exception
            }

        }
    }

}
