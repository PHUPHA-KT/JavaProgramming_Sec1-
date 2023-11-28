import java.util.*;
import java.text.*;
public class SalespersonSalary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("$#,###.00");
		// TODO Auto-generated method stub
		final double COMMISSION_RATE = 0.15;
		 final int SENTINEL = -1; // Terminating value for input
		 // Declare variables
		 int sales; // Input gross sales
		 double salary; // Salary to be compute
		 while(true)
		 {
			 System.out.print("Enter sales in dollars (or -1 to end):");
			 sales = scan.nextInt();
			 if(sales == SENTINEL)
			 {
				 System.out.println("Bye Bye");
				 break;
			 }
			 salary = 1000+(sales*COMMISSION_RATE);
			 System.out.println("Salary is: "+frm.format(salary));
		 }
	}

}
