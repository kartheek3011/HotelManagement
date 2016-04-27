package Service.Model;

public class UserOrderMap {

	
	private int  UserId ;
	private int  OrderId ;
	private String  OrderStatus ;
	private int TableNumber ;

	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public int getOrderId() {
		return OrderId;
	}
	public void setOrderId(int orderId) {
		OrderId = orderId;
	}
	public String getOrderStatus() {
		return OrderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		OrderStatus = orderStatus;
	}
	public int getTableNumber() {
		return TableNumber;
	}
	public void setTableNumber(int TableNumber) {
		TableNumber = tableNumber;
	}

	
}
