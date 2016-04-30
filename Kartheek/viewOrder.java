
public void vieworder(actionEvent event){

	((Node)event.getSource()).getScene().getWindow().hide();
	Stage primaryStage = new Stage();

	 Scene scene = new Scene(new Group());
    stage.setTitle("Order View");
    stage.setWidth(450);
    stage.setHeight(500);


    final Label labelHead = new Label("Order ");
    labelHead.setFont(new Font("Arial", 20));

    #TODO just check if table number is required....
	final Label label1 = new Label("Order Id");
	label1.setFont(new Font("Arial", 20));
	final Label label2 = new Label("Table Number");
	label1.setFont(new Font("Arial", 20));
	final Label label3 = new Label("Status");
	label1.setFont(new Font("Arial", 20));



	int i;
	//For each get the relevant from Order Id
	GridPane gridpane = new GridPane();
	for(i=1; i <=  ;i++)
	{
	    Label orderid = new Label(" "); //TODO 
    	orderid.setFont(new Font("Arial", 20));
    	orderid.setMinWidth(5);

		Label tablenumber = new Label(" "); //TODO 
	    tablenumber.setFont(new Font("Arial", 20));
    	tablenumber.setMinWidth(5);

    	//TODO check if we need to add it as textField
	    TextField status= new TextField(0);
		status.setFont(new Font("Arial", 20));
    	status.setMinWidth(5);

		gridpane.add(orderid, 1, i);
		gridpane.add(tablenumber, 2, i);
		gridpane.add(status, 3, i);

	}

   	Button order = new Button("Change Order Status");
   	gridpane.add(order, i);


    stage.setScene(scene);
    stage.show();


