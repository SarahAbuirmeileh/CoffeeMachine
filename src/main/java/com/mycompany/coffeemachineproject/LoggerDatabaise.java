package com.mycompany.coffeemachineproject;

import java.sql.*;

/**
 *
 * @author ساره
 */
public class LoggerDatabaise implements Logger {

    @Override
    public void log(String message) {

    }

    void storeToDatabase(String description) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/coffee_machine", "safa", "1234");

            String insertSql = "INSERT INTO logs (description) VALUES(" + "\"" + description + "\"" + ")";
            PreparedStatement preparedStmt = con.prepareStatement(insertSql);
            preparedStmt.execute();

            String slecteSql = "SELECT * FROM logs";
//            stmt.executeQuery();
//            while (rs.next()) {
//                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
//            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
//        ResultSet rs = stmt.executeQuery("INSERT INTO logs (description) VALUES(" + description + ")");
}

/*
    xampp
    general encoging utf8 general ci
    String details = '';
    loggers
    String query = "insert into loggers (details) values (details)"
    mysql.execute(query);

 */
