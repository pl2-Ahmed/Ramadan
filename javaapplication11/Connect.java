/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication11;
import java.sql.*;
/**
 *
 * @author RMDN
 */

public class Connect {
     String user="root";
    String password="";
     String address="jdbc:mysql://localhost/gym_db";
     Connection connection;

    public Connection connect() throws SQLException {
        return connection=DriverManager.getConnection(address,user,password);
    }
}