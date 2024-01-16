
public class testData {
	public static void main(String[] args) {
		 // Test all constructors and toString()
		 Data d1 = new Data(2024, 1, 16);
		 System.out.println(d1); // implicitly run toString()
		 
		 d1.setYear(2023);
		 d1.setMonth(15);
		 d1.setDay(16);
		 
		 System.out.println(d1);
		 System.out.println("Year is : "+d1.getYear());
		 System.out.println("Month is : "+d1.getMonth());
		 System.out.println("Day is : "+d1.getDay());
		 
		 d1.setDate(2024,10,10);
		 System.out.println(d1);
	}
}
