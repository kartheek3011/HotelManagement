package Service.Model;

public class Item {
	
	
	private int Id;
	private String  ItemName ;
	private Double Price;
	private int Status;

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public Double getPrice() {
		return Price;
	}
	public void setPrice(Double price) {
		Price = price;
	}
	public int getStatus() {
		return Status;
	}
	public void setStatus(int status) {
		Status= status;
	}

}
