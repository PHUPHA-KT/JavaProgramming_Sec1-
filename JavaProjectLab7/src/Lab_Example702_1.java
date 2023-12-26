import javax.swing.*;

public class Lab_Example702_1 {
	static int[] validValues = { 101, 108, 201, 213, 266, 304, 311, 409, 411, 412 };
	static double[] price = { 0.89, 1.23, 3.50, 0.69, 5.79, 3.19, 0.99, 0.89, 1.26, 8.00 };
	static double Iprice = 0.0;
	static boolean ch = false;
	public static void main(String[] args) {
		input();
	}
	public static void input() {
		int num =Integer.parseInt(JOptionPane.showInputDialog(null,"Enter item number yo order"));
					
		if(cheakItem(num)) {
			System.out.println("Item "+num+ " is " + Iprice);			
		}
		else
		{
			System.out.println("Invalid Item");	
		}
		


	}
	public static boolean cheakItem(int item) {
		for(int i=0; i<validValues.length;i++) {
			if (item == validValues[i]){ 
				
				ch = true;
			}
			
		}
		return ch;
	}
}
	
	
		
		
	



