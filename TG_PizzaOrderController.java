/**
* Program Name:	PizzaOrderController.java
*      Purpose: A listener for the Ok and Cancel button used in PizzaOrder
*        Coder:	Tyler Gosling
*         Date: August 22, 2018   
*/
import java.awt.CheckboxGroup;
import java.util.Vector;

import javax.swing.JOptionPane;

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
	@FXML private Button okBtn, cnclBtn;
	
	
	@FXML protected void handleRadioButtonAction(ActionEvent event)
	{
		try
		{
			//User Info
			String usrName = userName.getText();
			String usrPhne = userPhone.getText();
			String usrAdrs = userAddress.getText();
			//Order Info 
			String szInfo = "";
			String crstInfo = "";
			Vector<String> toppings = new Vector<String>();
			String holder = "";
			
			//Size selection
			if(sizeGroup.getSelectedToggle().equals(smPizza))
			{
				szInfo = "small";
			}
			else if(sizeGroup.getSelectedToggle().equals(medPizza))
			{
				szInfo = "medium";
			}
			else if(sizeGroup.getSelectedToggle().equals(lrgPizza))
			{
				szInfo = "large";
			}
			else if(sizeGroup.getSelectedToggle().equals(xLrgPizza))
			{
				szInfo = "extra large";
			}
			
			//Crust selection
			if(crstGroup.getSelectedToggle().equals(thinCrst))
			{
				crstInfo = "thin";
			}
			else if(crstGroup.getSelectedToggle().equals(regCrst))
			{
				crstInfo = "regular";
			}
			else if(crstGroup.getSelectedToggle().equals(thkCrst))
			{
				crstInfo = "thick";
			}
			
			//Topping Selection
			if(pepBox.isSelected()) toppings.add("Pepperoni");
			if(sausgBox.isSelected()) toppings.add("Sausage");
			if(grPeprBox.isSelected()) toppings.add("Green Peppers");
			if(olvBox.isSelected()) toppings.add("Olives");
			if(mushBox.isSelected()) toppings.add("Mushrooms");
			if(tomBox.isSelected()) toppings.add("Tomatoes");
			if(ancBox.isSelected()) toppings.add("Anchovies");
			if(oniBox.isSelected()) toppings.add("Onion");
			
			holder = toppings.toString();
			
			System.out.println("Customer Order\n\n"+usrName+"\n"+usrPhne+"\n"+usrAdrs+"\n"
					+"\n\nYou have ordered a " + szInfo + " " + crstInfo + " crust pizza\n with the following toppings: " + holder);
			
			JOptionPane.showMessageDialog(null, "Customer Order\n\n"+usrName+"\n"+usrPhne+"\n"+usrAdrs+"\n"
					+"\n\nYou have ordered a " + szInfo + " " + crstInfo + " crust pizza\nwith the following toppings: " + holder, usrName+"'s Pizza Order", JOptionPane.PLAIN_MESSAGE);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
