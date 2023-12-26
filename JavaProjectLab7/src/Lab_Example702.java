import javax.swing.*;
public class Lab_Example702 {

	public static void main(String[] args) {
		int[] validValues = { 101, 108, 201, 213, 266, 304, 311, 409, 411, 412 };
		double[] price = { 0.89, 1.23, 3.50, 0.69, 5.79, 3.19, 0.99, 0.89, 1.26, 8.00 };
		int num =Integer.parseInt(JOptionPane.showInputDialog(null,"Enter item number yo order"));
		boolean ch = false;
		for(int i=0; i<validValues.length;i++) {
			if (num == validValues[i]){ 
				System.out.print("Item "+num+" is "+price[i]);
				ch = true;				
			}
							
		}
		if(ch==false) {
			System.out.println("Invalid Item");			
		}
		


	}
	

}
