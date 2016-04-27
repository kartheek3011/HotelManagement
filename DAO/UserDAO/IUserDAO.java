package Service.DAO.UserDAO;

import Service.Model.User;

public interface IUserDAO {

	Boolean AuthenticateUser(String UserName , String Password);
	
	User GetUser(String UserName);
}
