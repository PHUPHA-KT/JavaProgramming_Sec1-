import javax.swing.*;
import java.text.*;
public class Example1 {

	public static void main(String[] args) {;
		DecimalFormat frmid = new DecimalFormat("#,###.00");
		final int PRICE = 299;
		int cus = Integer.parseInt(JOptionPane.showInputDialog("How many customer per bill?"));		
		//Show DialogBox
		int total = PRICE*cus;
		int option ;
		do {
			option = JOptionPane.showConfirmDialog(null,"Total Price is "+ frmid.format(total) +" baht."
					 + "\nDo you have a memberr card?" );	
		}while (option == JOptionPane.CANCEL_OPTION);
		
		if (option == JOptionPane.YES_OPTION)
		{
			int totals = total-(total*10/100);
			JOptionPane.showMessageDialog(null,"Amount to be paid is "+frmid.format(totals)+" baht.");
		}
		else if (option == JOptionPane.NO_OPTION)
		{			
			JOptionPane.showMessageDialog(null,"Amount to be paid is "+frmid.format(total)+" baht.");
		}
		

	
	}
}
