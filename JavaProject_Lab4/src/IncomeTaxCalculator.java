import java.util.*;
import java.text.*;
public class IncomeTaxCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("$#,###.00");
		// TODO Auto-generated method stub
		final double TAX_RATE_ABOVE_20K = 0.1;
		 final double TAX_RATE_ABOVE_40K = 0.2;
		 final double TAX_RATE_ABOVE_60K = 0.3;
		 // Declare variables
		
		 int taxableIncome;
		 double taxPayable;
		 taxableIncome= 85000;
		 // Compute tax payable in "double" using a nested-if to handle 4 cases
		 if (taxableIncome <= 20000) { // [0, 20000]
		 taxPayable = 0 ;
		 } 
		 else if (taxableIncome <= 40000) { // [20001, 40000]
		 taxPayable = (taxableIncome-20000)*TAX_RATE_ABOVE_20K;
		 } 
		 else if (taxableIncome <= 60000) { // [40001, 60000]
		 taxPayable = 2000+(taxableIncome-40000)*TAX_RATE_ABOVE_40K;
		 } 
		 else { // [60001, ]
		 taxPayable = 6000+(taxableIncome-60000)*TAX_RATE_ABOVE_60K;
		 }
		 System.out.print(frm.format(taxPayable));
	}

}


