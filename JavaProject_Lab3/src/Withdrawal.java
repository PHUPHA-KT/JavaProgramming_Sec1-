import javax.swing.*;

import java.text.DecimalFormat;
import java.util.*;
public class Withdrawal {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###");
		Random rand = new Random();
		int balance = rand.nextInt(9)*100000;
		int withd = Integer.parseInt(JOptionPane.showInputDialog("Your balance : "+balance+
																		"\nInput money to withdraw: "));
		
		if (withd>balance)
		{
			JOptionPane.showMessageDialog(null,
					"Error : cannot withdraw more than blance "
					,"ERROR",JOptionPane.ERROR_MESSAGE);
		}
		
		else if(withd>20000)
		{
				JOptionPane.showMessageDialog(null,
						"Error : cannot withdraw more than 20,000 "
						,"ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if (withd % 100 !=0)
		{
				JOptionPane.showMessageDialog(null,
						"Error : cannot withdraw "+(withd%100)
						,"ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else 
		{
			JOptionPane.showMessageDialog(null,
					"Your withdraw "+frm.format(withd)+" baht."+
					"\n1000 = "+(withd/1000)+
					"\n500  = "+(withd%1000/500)+
					"\n100  = "+(withd%1000%500/100));
		}
			
	
		

	}

}
