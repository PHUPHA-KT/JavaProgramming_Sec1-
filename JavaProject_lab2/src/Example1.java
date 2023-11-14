
public class Example1 {

	public static void main(String[] args) {
		String	isbn="IB2-6325-85-4-1",title="Basic Java";
		int unit = 5;
		double price = 225.75;
		System.out.println("Book ISBM : "+isbn);
		System.out.println("Book Title : "+title);
		System.out.println("Book Unit : "+unit);
		System.out.println("Book Price : "+price);
		System.out.println("----------------------------");
		double total = unit * price;
		System.out.println("Total Price is  : "+total);
		double vat = total+(total*7/100);
		System.out.println("Add VAT 7% : "+vat);

	}

}
