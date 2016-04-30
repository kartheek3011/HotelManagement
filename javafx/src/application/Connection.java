package application;
import java.sql.*;
public class Connection {
  public static java.sql.Connection Connector() {
 try {
  Class.forName("com.mysql.jdbc.Driver");
  java.sql.Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "root");
 // Connection conn= DriverManager.getConnection(
  		//"jdbc:mysql://localhost:3306/hotel","root","root");
  return conn;
 } catch (Exception e) {
  System.out.println(e);
  return null;
  // TODO: handle exception
 }
}
}