package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class CustomerController implements Initializable{

	@FXML
	private Label cust;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}
	public void getuserid(String user) {
		// TODO Auto-generated method stub
cust.setText("userid:"+ user);
	}

	public void signout(ActionEvent event){
		((Node)event.getSource()).getScene().getWindow().hide();
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();


		Pane root = null;
		try {
			root = loader.load(getClass().getResource("/application/login.fxml").openStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		   Scene scene = new Scene(root);
		   scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		   primaryStage.setScene(scene);
		   primaryStage.show();

	}
	public void viewmenu(ActionEvent event){
		((Node)event.getSource()).getScene().getWindow().hide();
		Stage primaryStage = new Stage();
		FXMLLoader loader = new FXMLLoader();


		Pane root = null;
		try {
			root = loader.load(getClass().getResource("/application/customer_menu.fxml").openStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		   Scene scene = new Scene(root);
		   scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		   primaryStage.setScene(scene);
		   primaryStage.show();

	}
}
