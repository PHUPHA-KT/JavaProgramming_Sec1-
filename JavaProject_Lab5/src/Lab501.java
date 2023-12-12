import java.util.*;
public class Lab501 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Full Name: ");
		String fullname = scan.nextLine();
		int result=fullname.indexOf(' ');		
		if(result==-1)
		{
			System.out.print("Incorrent Name");
		}
		else {
		String firstName =fullname.substring(0,result).trim() ;
		String lastname =fullname.substring(result+1).trim() ;
		System.out.println("First Name : "+firstName.toUpperCase());
		System.out.println("Last Name : "+lastname.toLowerCase());
		}
	}
}
		
		

	


