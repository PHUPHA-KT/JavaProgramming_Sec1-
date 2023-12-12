import java.util.Scanner;

public class Lab505 {

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
		String firstName =fullname.substring(0,1).trim() ;
		String midname = fullname.substring(fullname.indexOf(' ')+1, fullname.indexOf(' ')+2).trim();
		String lastname =fullname.substring(fullname.lastIndexOf(' ')).trim() ;
		System.out.println(firstName+"."+midname+"."+lastname+".");
		



	}
	}
}
	


