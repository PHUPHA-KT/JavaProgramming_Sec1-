import java.text.*; //จัด format
public class Example2 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		final double PRICE = 299;
		final int COUSTOMER = 5 ;
		double netPrice = PRICE * COUSTOMER;
		System.out.println("Buffet of "+COUSTOMER+" customers is "+frm.format(netPrice));
		double vat = netPrice+(netPrice*3/100);
		System.out.println("Add service charge 3% is "+frm.format(vat));
	}

}
