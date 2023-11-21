import javax.swing.*;

import java.text.DecimalFormat;
import java.util.*;
public class  Icecream {

	public static void main(String[] args) {
		final int VANILLA = 10, CHOCOLATE = 15, TOPPING = 5;
		int ice;
		do {
		ice = Integer.parseInt(JOptionPane.showInputDialog("[1] Vanilla Flavor 10 B."+
																"\n[2] Chocolate Flavor 15 B."+
																"\nPress number to chosse Flaver:"));
		if(ice !=1 && ice !=2);
		{
			JOptionPane.showMessageDialog(null,
					"Error : Wrong choice! "+
					"\nTry again..."
					,"ERROR",JOptionPane.ERROR_MESSAGE);
		}
		
		}while(ice ==1 && ice ==2);
		
		
			
	
		

	}

}
