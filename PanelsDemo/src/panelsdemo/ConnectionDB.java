/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panelsdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Prakhar
 */
public class ConnectionDB {
    public static Connection connect() throws ClassNotFoundException, SQLException{
        Connection conn;
        Class.forName("com.mysql.jdbc.Driver");
        conn=DriverManager.getConnection("jdbc:mysql:///logintest", "root","root");
        return conn;
    }
}
