import javax.swing.*;
public class Shop100Baht {
	public static void main(String[] args) {
		Product sold = new Product();
		int comfirm = JOptionPane.showConfirmDialog(null,"is the profram run on pattanakarn Branch?",
									"Run Program",JOptionPane.YES_NO_OPTION);
		if(comfirm==0) {
			sold = new PatanakarnBranch();
		}
		
		int numberofProduct = Integer.parseInt(JOptionPane.showInputDialog("Input the number of product"));
		
		sold.setUnit(numberofProduct);
		
		JOptionPane.showMessageDialog(null, sold.toString());
		
	}

}
