package Service.DAO.UserOrderMapDAO;

public class UserOrderMapDAO implements IUserOrderMapDAO {

	private Connection connection; 
		
		public OrderDAO() throws Exception{
			
			try {
				connection = new DbUtil().getConnection();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new Exception("Error"+e.getMessage());
				
				
			}

		public int getOrderIdforUser(int userId) throws Exception{

			try{
				Statement statement = connection.createStatement();
				ResultSet rs = statement.executeQuery("select orderid from userordermap where UserId='"+userId+"' and OrderStatus=1");
				return rs.getInt("OrderId");

			} catch (Exception e){
				e.printStackTrace()
			
			}	
		}

		public List<int> getListOfOrderIds(String orderStatus) throws Exception{

			try{
				List<int> listOfOrderId = new ArrayList<int>();
				Statement statement = connection.createStatement();
				ResultSet rs = statement.executeQuery("select orderid from userordermap where OrderStatus='"+orderStatus+"'");
				while (rs.next()) 
					listOfOrderId.add(rs.getInt("orderId"));
				
				return listOfOrderId;

			} catch (Exception e){
				e.printStackTrace()
			    
			    return null;
			}

		public Boolean UpdateOrderStatus(int orderId) throws Exception{

			try{
				Statement statement = connection.createStatement();
				statement.executeUpdate("update userordermap set status=status+1 where OrderId='"+orderId+"'")
				return rs.getInt("OrderId")

			} catch (Exception e){
				e.printStackTrace()
			
			}	
		}

}
