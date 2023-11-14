import java.text.DecimalFormat;
import java.util.*;
import java.text.*;
public class Example3 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Scanner input = new Scanner(System.in); //class
		System.out.print("Input product name  : ");
		String productname = input.nextLine();
		System.out.print("Input product unit  : ");
		int unit = input.nextInt();
		System.out.print("Input product price : ");
		double price = input.nextDouble();
		double total = unit * price ;
		System.out.println("\nTotal price is : "+frm.format(total)+" baht.");
		double vat = total+(total*7/100);
		System.out.println("Add vat 7%  is : "+frm.format(vat)+" baht.");
		

	}

}
