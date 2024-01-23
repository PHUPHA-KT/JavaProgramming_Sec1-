
public class TestCustomer {

	public static void main(String[] args) {
		System.out.println("###Test Customer class###");
		 Customer c1 = new Customer(1088, "Conan Edogawa", 10);
		 
		 // Customer's toString() 
		 System.out.println(c1);
		 // set customer's discount is 5 
		 c1 = new Customer(1088, "Conan Edogawa", 5);
		 // Customer's toString()
		 System.out.println(c1);
		 
		 Line();
		 System.out.println("id is: "+c1.getID());// show customer's id
		 System.out.println("name is: "+c1.getName());// show customer's name
		 System.out.println("discount is: "+c1.getDiscount());// show customer's discount
		 Line();
		 System.out.println("###Test Invoice class###");
		 Invoice inv1 = new Invoice(101, c1, 12000.00);
		 // Invoice's toString()
		 System.out.println(inv1);
		 // set invoice's amount is 10000 
		 inv1 = new Invoice(101, c1, 10000.00);
		 // Invoice's toString()
		 System.out.println(inv1);
		 
		 Line();
		 System.out.println("customer's id is: "+inv1.getID());// show invoice's id
		 System.out.println("customer's name is: "+inv1.getCustomer());// Customer's toString() by instance inv1
		 System.out.println("customer's discount is: "+inv1.getAmount());// show invoice's amount
		 Line();
		 System.out.println("customer's id is: "+inv1.getID());// show customer's id by instance inv1
		 System.out.println("customer's name is: "+inv1.getCustomerName());// show customer's name by instance inv1
		 System.out.println("customer's discount is: "+inv1.getCustomerDiscount());// show customer's discount by instance inv1
		 System.out.println("amount after discount is: "+inv1.getCustomerAfterDiscount());// show invoice's amount after discount(format as output)
		 } //end of main method()
		 public static void Line() {
			 System.out.println("**********************************************************************");
		 //use for() statement to display symbol *
			 
	}

}
