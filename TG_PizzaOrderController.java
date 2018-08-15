/**
* Program Name:	PizzaOrderController.java
*      Purpose: A listener for the Ok and Cancel button used in PizzaOrder
*        Coder:	Tyler Gosling
*         Date: August 22, 2018   
*/
import java.awt.CheckboxGroup;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;

public class TG_PizzaOrderController {

	@FXML private Text title, szTitle, crstTitle, topTitle;
	@FXML private TextField userName, userPhone, userAddress;
	@FXML private RadioButton smPizza, medPizza, lrgPizza, xLrgPizza, 
							  thinCrst, regCrst, thkCrst;
	@FXML private ToggleGroup sizeGroup, crstGroup;
	@FXML private CheckBox pepBox, sausgBox, grPeprBox, olvBox, 
						   mushBox, tomBox, ancBox, oniBox;
	@FXML private CheckboxGroup toppingGroup;
	
	
	@FXML protected void handleRadioButtonAction(ActionEvent event)
	{
		
	}
}
