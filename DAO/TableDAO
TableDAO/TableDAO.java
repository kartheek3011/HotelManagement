package Service.DAO.TableDAO;

public class TableDAO implements ITableDAO {

	private Connection connection; 
		
		public TableDAO() throws Exception{
			
			try {
				connection = new DbUtil().getConnection();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new Exception("Error"+e.getMessage());
				
			}

		public Boolean StatusUpdateToOccupied(int tableId) throws Exception{
		
		try {
			Statement statement = connection.createStatement();
			statement.executeUpdate("update table set status=1 where id='"+tableId+"'")
			return True;
		} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new Exception("Error"+e.getMessage());
				
		}

		public Boolean StatusUpdateToUnOccupied(int tableId) throws Exception{

			Statement statement = connection.createStatement();
			statement.executeUpdate("update table set status=0 where id='"+tableId+"'")
			return True;
		
		} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new Exception("Error"+e.getMessage());
			
		}