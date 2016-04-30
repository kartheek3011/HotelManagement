package application;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class LoginController implements Initializable {
 public LoginModel loginModel = new LoginModel();


   @FXML
   private Label isConnected;
   @FXML
	private TextField pass;
   @FXML
	private TextField id;

 @Override


 public void initialize(URL location, ResourceBundle resources) {
  // TODO Auto-generated method stub
  if (loginModel.isDbConnected()) {

   isConnected.setText("Connected");
  } else {

   isConnected.setText("Not Connected");
  }
 }
 public void login(ActionEvent event) throws SQLException{
	/* System.out.println("hi");
	 System.out.println(id.getText());
	 System.out.println(pass.getText());*/

if(LoginModel.AuthenticateUser(id.getText(),pass.getText())){
	isConnected.setText("correct");
	((Node)event.getSource()).getScene().getWindow().hide();
	Stage primaryStage = new Stage();
	FXMLLoader loader = new FXMLLoader();


	Pane root = null;
	try {
		root = loader.load(getClass().getResource("/application/customer.fxml").openStream());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	CustomerController custcontroller =  (CustomerController)loader.getController();
	custcontroller.getuserid(id.getText());
	   Scene scene = new Scene(root);
	   scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	   primaryStage.setScene(scene);
	   primaryStage.show();

}
else{
	isConnected.setText("not correct");
}
	}

}