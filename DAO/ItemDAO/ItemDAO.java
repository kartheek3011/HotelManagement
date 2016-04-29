package Service.DAO.ItemDAO;

public class ItemDAO implements IItemDAO {

	private Connection connection; 
		
		public ItemDAO() throws Exception{
			
			try {
				connection = new DbUtil().getConnection();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new Exception("Error"+e.getMessage());
				
				
			}

		@Override
		public Boolean CreateItem(String itemName, Double price) {
			// TODO Auto-generated method stub
			try
			{
				Statement statement = connection.createStatement();
				ResultSet rs = statement.executeQuery("select * from user where ItemName='"+itemName+"' and Status='"+0+"'");
				
				if (!rs.first()) {
				    // throw error or return
					statement.executeUpdate("update item set status=1 where ItemName='"+itemName+"'")
					return True;
				}
				else{
					statement.executeUpdate("insert into item values('"+itemName+"','"+price+"','"+1+"')")
					return True;
				}
				
			} catch (SQLException error) {

				error.printStackTrace();
			}
			return null;
		}

		@Override
		public Item GetItem(int itemId){

			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from user where ItemId='"+itemId+"' and Status='"+1+"'");

			Item item = new Item()
            item.setId(rs.getInt("id"));
            item.setItemName(rs.getString("itemname"));
            item.setPrice(resultSet.getDouble("price"));
            item.setStatus(resultSet.getInt("status"));

            return item
		} 	
			
		//TODO with the return of objects .
		@Override
		public List<Item> GetItemList() {

			try{

				List<Item> itemsList = new ArrayList<Item>();
				Statement statement = connection.createStatement();
				ResultSet rs = statement.executeQuery("select * from item where Status='"+1"'");

				while (rs.next()) {
				            Item item = new Item()
				            item.setId(rs.getInt("id"));
				            item.setItemName(rs.getString("itemname"));
				            item.setPrice(resultSet.getDouble("price"));
				            item.setStatus(resultSet.getInt("status"));
				            itemsList.add(item);
				        }
				return itemsList

			}catch (SQLException error) {

				error.printStackTrace();
			}

		@Override
		public Boolean DeleteItem(String itemName) {
			// TODO Auto-generated method stub
			try
			{
				Statement statement = connection.createStatement();
				ResultSet rs = statement.executeQuery("select * from user where ItemName='"+itemName+"' and Status='"+1+"'");
				
				if (!rs.first()) {
				    // throw error or return
					return False;
				}
				else{
					statement.executeUpdate("update item set status=0 where ItemName='"+itemName+"'")
					return True;
				}
				
			} catch (SQLException error) {

				error.printStackTrace();
			}
			return null;
		}				

		}

}
