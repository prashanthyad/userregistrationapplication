package com.sathya.servletex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Dao {
	public int saveUser(String username,String password,String email,String mobile)
	{
		int result=0;
		//create the Connection 
		Connection connection = Databaseutils.createConnection();
		
		try {
		//store the data into data base 
		PreparedStatement preparedStatement = connection.prepareStatement("insert into user_register values(?,?,?,?)");
		preparedStatement.setString(1, username);
		preparedStatement.setString(2, password);
		preparedStatement.setString(3, email);
		preparedStatement.setString(4, mobile);
		result=preparedStatement.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return result;
	}	
	//searching by the email
	public Userinfo findByEmail(String email)
	{
		Userinfo userinfo=null;
		Connection connection=Databaseutils.createConnection();
		
			try {
				PreparedStatement preparedStatement=connection.prepareStatement("select * from user_register where email=(?)");
				preparedStatement .setString(1,email);
				ResultSet resultset=preparedStatement.executeQuery();
				if(resultset.next())
				{
				userinfo=new Userinfo();
				userinfo.setUsername(resultset.getString(1));
				userinfo.setPassword(resultset.getString(2));
				userinfo.setEmail(resultset.getString(3));
				userinfo.setMobile(resultset.getString(4));
				}
				
			} 
			catch (SQLException e)
			{
				
				e.printStackTrace();
			}
			return userinfo;
			
	}
	//deleting the data by using the mobile number
	public int deleteByMobile(String mobile)
	{
		int result=0;
		Connection connection=Databaseutils.createConnection();
        try {
        	PreparedStatement preparedStatement=connection.prepareStatement("delete from user_register where moblie=?");
			preparedStatement .setString(1,mobile);
			result=preparedStatement.executeUpdate();
        }
        catch(SQLException e)
        {
        	e.printStackTrace();
        }
        return result;
	}
	
	public List<Userinfo> getAllUsers()
	{
		List<Userinfo> listofusers=new ArrayList<Userinfo>();
		Connection connection=Databaseutils.createConnection();
		try {
			Statement statement=connection.createStatement();
			ResultSet resultset=statement.executeQuery("select * from user_register");
			while(resultset.next())
			{
				Userinfo userinfo=new Userinfo();
				userinfo.setUsername(resultset.getString(1));
				userinfo.setPassword(resultset.getString(2));
				userinfo.setEmail(resultset.getString(3));
				userinfo.setMobile(resultset.getString(4));
				listofusers.add(userinfo);
			}
			
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return listofusers;
				
	}
	
	
	
	
	
	
	
	
	
	
	
}
		
	

