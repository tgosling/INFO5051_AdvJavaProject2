/**
* Program Name:	PizzaOrderGUI.java
*      Purpose: To provide a GUI for a pizza order 
*        Coder:	Tyler Gosling
*     Due Date: August 22, 2018   
*/

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.scene.control.*;
import javafx.stage.*;

public class PizzaOrderGUI extends Application{
	
	@Override
	public void start(Stage primaryStage) 
	{
		try
		{
			Parent root = FXMLLoader.load(getClass().getResource("pizza_order.fxml"));
			
			//Set title
			primaryStage.setTitle("Tyler Gosling's Pizza Order GUI");
			
			Scene scene = new Scene(root,600,400);
			
			primaryStage.setScene(scene);
			primaryStage.show();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}
}







