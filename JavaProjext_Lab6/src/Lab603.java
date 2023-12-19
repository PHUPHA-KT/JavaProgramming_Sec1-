import java.util.Scanner;

public class Lab603 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Full Name: ");
		String fullname = scan.nextLine();
		
		System.out.println(abbreviatName(fullname));
		
	}
	public static String abbreviatName(String fullname) {
				
			String firstName =fullname.substring(0,fullname.indexOf(' ')) ;
			String midname = fullname.substring(fullname.indexOf(' ')+1, fullname.indexOf(' ')+2);
			String lastname =fullname.substring(fullname.lastIndexOf(' ')+1,fullname.lastIndexOf(' ')+2) ;
			return (midname+"."+lastname+"."+firstName+".");
		
	}
//Robert john Downey
}
