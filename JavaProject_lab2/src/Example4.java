import java.text.DecimalFormat;
import java.util.*;
import java.text.*;
import javax.swing.JOptionPane;
public class Example4 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		String name = JOptionPane.showInputDialog("Input Product Name :");
		int unit = Integer.parseInt(JOptionPane.showInputDialog("Input Product Unit :"));
		double price = Double.parseDouble(JOptionPane.showInputDialog("Input Price per unit :"));
		double total = unit * price,vat = total+(total*7/100);	
		JOptionPane.showMessageDialog(null,"Total Price is "+frm.format(total)+" baht."+
										"\nAdd VAT 7% is "+frm.format(vat)+" baht.");
		
	 
	}
}

