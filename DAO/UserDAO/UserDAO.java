package Service.DAO.UserDAO;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Service.ConnectionUtil.DbUtil;
import Service.Model.User;

public class UserDAO implements IUserDAO{

	private Connection connection; 
	
	public UserDAO() throws Exception{
		
		try {
			connection = new DbUtil().getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("Error"+e.getMessage());
			
			
		}
		
	}
	@Override
	public Boolean AuthenticateUser(String UserName, String Password) {
		// TODO Auto-generated method stub
		try
		{
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from user where UserName='"+UserName+"' and Password='"+Password+"'");
			
			if (!rs.first()) {
			    // throw error or return
				return false;
			}
			else
				return true;
			
		}catch(SQLException error){
			error.printStackTrace();
		}
		return null;
	}
	@Override
	public User GetUser(String UserName) {
		// TODO Auto-generated method stub
		try{
			
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from user where UserName='"+UserName+"'");
			
			User user = new User();  
	       	  
			 while (rs.next()) {  
				  
	  
	                user.setId(rs.getInt("Id"));  
	  
	                user.setUserName(rs.getString("UserName"));  
	  
	                user.setPassword(rs.getString("Password"));  
	  
	                user.setEmail(rs.getString("Email"));  
	  
	                user.setUserTypeId(rs.getInt("UserTypeId"));  
	  
	  
	            }  
     
			 return user;
			 
		}catch(Exception error){
			error.printStackTrace();
			return null;
		}
	}

}
