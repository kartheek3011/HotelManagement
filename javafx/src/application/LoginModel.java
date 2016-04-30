package application;
import java.sql.*;
public class LoginModel {
  static java.sql.Connection conection;
  public LoginModel () {
   conection = Connection.Connector();
   if (conection == null) {

   System.out.println("connection not successful");
    System.exit(1);}
  }

  public boolean isDbConnected() {

  return !conection.equals(null);

}
  public static Boolean AuthenticateUser(String UserName, String Password) {
		// TODO Auto-generated method stub

		try
		{
			Statement statement = conection.createStatement();
			ResultSet rs = statement.executeQuery("select * from customer_dummy where cust_id='"+UserName+"' and Pass='"+Password+"'");

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
}