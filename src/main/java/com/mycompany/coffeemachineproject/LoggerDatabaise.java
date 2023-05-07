package com.mycompany.coffeemachineproject;

import java.sql.*;

/**
 *
 * @author ساره
 */
public class LoggerDatabaise implements Logger {

    @Override
    public void log(String description) {
        try {
           Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/coffee_machine", "safa", "1234")) {
                String insertSql = "INSERT INTO logs (description) VALUES(" + "\"" + description + "\"" + ")";
                PreparedStatement preparedStmt = con.prepareStatement(insertSql);
                preparedStmt.execute();
            }
       } catch (ClassNotFoundException | SQLException e) {
           System.out.println(e);
       }
    }
}
