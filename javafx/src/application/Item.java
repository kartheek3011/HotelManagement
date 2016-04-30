package application;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Item {


	private  final SimpleIntegerProperty Id;
	private  final SimpleStringProperty  ItemName ;
	private  final SimpleDoubleProperty Price;
	private  final SimpleStringProperty Status;
	 Item(int Id, String ItemName, double Price, String Status) {
	        this.Id = new SimpleIntegerProperty(Id);
	        this.ItemName = new SimpleStringProperty(ItemName);
	        this.Price = new SimpleDoubleProperty(Price);
	        this.Status = new SimpleStringProperty(Status);
	    }

	public int getId() {
		return Id.get();
	}

	public String getItemName() {
		return ItemName.get();
	}

	public Double getPrice() {
		return Price.get();
	}

	public String getStatus() {
		return Status.get();
	}


}