package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class MenuController implements Initializable {
	@FXML private  TableView<Item> itemtable;
	@FXML private TableColumn<Item, Integer> Id;
	@FXML private TableColumn<Item, String> ItemName;
	@FXML private TableColumn<Item,Double> Price;
	@FXML private TableColumn<Item, String> Status;


	private final ObservableList<Item> list =
    FXCollections.observableArrayList(
    		new Item(1,"chicken",70,"available"),
    		new Item(1,"mutton",80,"available"),
    		new Item(1,"fish",90,"available")


    );
	public void initialize(URL location, ResourceBundle resources) {

		Id.setCellValueFactory(new PropertyValueFactory<Item, Integer>("Id"));
		ItemName.setCellValueFactory(new PropertyValueFactory<Item, String>("ItemName"));
		Price.setCellValueFactory(new PropertyValueFactory<Item, Double>("Price"));
		Status.setCellValueFactory(new PropertyValueFactory<Item, String>("Status"));
		itemtable.setItems(list);

	}

}
