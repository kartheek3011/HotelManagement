package Service.DAO.UserTypeDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Service.ConnectionUtil.DbUtil;
import Service.Model.UserType;

public class UserTypeDAO implements IUserTypeDAO {

	private Connection connection; 
	
	
	public UserTypeDAO() throws Exception{
		try {
			connection = new DbUtil().getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("Error"+e.getMessage());
			
			
		}
	}
	
	
	@Override
	public List<UserType> GetAllTypes() {
		// TODO Auto-generated method stub
		
		try
		{
			List<UserType> types = new ArrayList<UserType>();
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from usertype");
			
			while (rs.next()) {
				
					UserType type = new UserType();
					type.setId(rs.getInt("Id"));
					type.setType(rs.getString("Type"));
					
					types.add(type);
			}
			
			return types;
			
		}catch(Exception Error){
			Error.printStackTrace();
			return null;
		}
		
		
	}

	
	
}
