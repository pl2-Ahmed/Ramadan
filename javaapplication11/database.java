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
public class database 
{
    static Connection connection;
    public static Connection connect() throws SQLException {

        return connection=DriverManager.getConnection("jdbc:mysql://localhost/gym_db","root","");
    }
    
    public static void setData(String Train_Message , int Train_Hours , int Coach_ID , int member_ID , String Train_Day)
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
    
    public static void getData() throws SQLException
    {
        Connection c=connect();
            Statement state= c.createStatement();
            String query= "select Train_message,Train_Hours,Coach_id,member_id,Train_day from train ";
                    ResultSet rs = state.executeQuery(query);
                    
                    while(rs.next()){
                        Train trainMessages = new Train();
                        trainMessages.setTrain_Message(rs.getString("Train_Message"));
                        trainMessages.setTrain_Hours(rs.getInt("Train_Hours"));
                        trainMessages.setCoach_ID(rs.getInt("Coach_ID"));
                        trainMessages.setMember_ID(rs.getInt("Member_ID"));
                        trainMessages.setTrain_Day(rs.getString("Train_Day"));
                        Train.Messages.add(trainMessages);

                    }
    }
}
