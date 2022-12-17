/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication11;
import java.sql.*;
import java.util.*;
/**
 *
 * @author RMDN
 */
public class getFromDataBase 
{
    static Connection connection;
    public static Connection connect() throws SQLException {

        return connection=DriverManager.getConnection("jdbc:mysql://localhost/gym_db","root","");
    }
    
    public static void getData(String Train_Message , int Train_Hours , int Coach_ID , int member_ID , String Train_Day)
    {
        try
        {
            Connection c = connect();
            Statement s = c.createStatement();
            String query = "insert into train values('"+Train_Message+"' , '"+Train_Hours+"' , '"+Coach_ID+"' , '"+member_ID+"' , '"+Train_Day+"')";
            s.execute(query);
        }
        catch(SQLException ee)
        {
            System.out.println(ee.getMessage());
        }
    }
}
