http://www.coderanch.com/t/603701/JavaFX/java/Tableview-TextField-Javafx


public void viewmenu(actionEvent event){

	((Node)event.getSource()).getScene().getWindow().hide();
	Stage primaryStage = new Stage();

	 Scene scene = new Scene(new Group());
    stage.setTitle("Table View Sample");
    stage.setWidth(450);
    stage.setHeight(500);


    final Label labelHead = new Label("View menu");
    labelHead.setFont(new Font("Arial", 20));

    #TODO get from the backend .I mean the table numbers that arent occupied
	ObservableList<String> options = 
    FXCollections.observableArrayList(
        "Option 1",
        "Option 2",
        "Option 3"
    );

	final ComboBox labelHead2 = new ComboBox(options);

	final Label label1 = new Label("Item Id");
	label1.setFont(new Font("Arial", 20));
	final Label label2 = new Label("Item Name");
	label1.setFont(new Font("Arial", 20));
	final Label label3 = new Label("Quantity");
	label3.setFont(new Font("Arial", 20));
	final Label label4 = new Label("Price per each");
	label4.setFont(new Font("Arial", 20));


	int i;
	//For each get the relevant from Order Id
	GridPane gridpane = new GridPane();
	for(i=1; i <=  ;i++)
	{
	    Label itemid = new Label(" "); //TODO 
    	itemid.setFont(new Font("Arial", 20));
    	itemid.setMinWidth(5);

		Label itemname = new Label(" "); //TODO 
	    itemname.setFont(new Font("Arial", 20));
    	itemname.setMinWidth(30);

	    TextField quantity= new TextField(0);
		quantity.setFont(new Font("Arial", 20));
    	quantity.setMinWidth(5);

		Label priceperitem = new Label(" "); //TODO 
	    priceperitem.setFont(new Font("Arial", 20));
    	priceperitem.setMinWidth(5);

		gridpane.add(itemid, 1, i);
		gridpane.add(itemname, 2, i);
		gridpane.add(quantity, 3, i);
		gridpane.add(priceperitem, 4, i);

	}

   	Button order = new Button("Order Now ");
   	gridpane.add(order, i);


    stage.setScene(scene);
    stage.show();



}