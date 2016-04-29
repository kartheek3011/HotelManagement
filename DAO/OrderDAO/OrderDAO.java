package Service.DAO.OrderDAO;

public class OrderDAO implements IOrderDAO{


	private Connection connection; 
		
		public OrderDAO() throws Exception{
			
			try {
				connection = new DbUtil().getConnection();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new Exception("Error"+e.getMessage());
				
				
			}

		@Override
		public Boolean CreateOrder(String orderId, int itemId,Date orderDate, int quantity) {
			// TODO Auto-generated method stub
			try
			{
				Statement statement = connection.createStatement();
				statement.executeUpdate("insert into order values('"+orderId+"','"+itemId+"','"+orderDate+"','"+quantity+"')");
				return True;

			} catch (SQLException error) {

				error.printStackTrace();
			}
			return null;
		}

		//-----imp ---- Here the quantity is imp and i dont know how to return 
		public List<Item> GetOrderItems(String orderId){

			try{
				List<Item> itemsList = new ArrayList<Item>();
				Statement statement = connection.createStatement();
				ResultSet rs = statement.executeQuery("select * from userordermap where OrderId='"+OrderId+"'");
				
				while (rs.next()) {
							ItemDao itemDao = new ItemDao()
				            Item item = itemDao.GetItem(rs.getInt("ItemId"));
				            itemsList.add(item);
				}
			return itemsList;
			}  catch (SQLException error) {

				error.printStackTrace();
			}
			return null;
		}

		



}
	private String OrderId ;
	private int  ItemId ;
	private Date  OrderDate;
	private int Quantity ;