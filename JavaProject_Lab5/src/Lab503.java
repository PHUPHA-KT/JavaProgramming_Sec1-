import java.util.Scanner;
public class Lab503 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Full Name: ");
		String mess = scan.nextLine();
		//int result=mess.indexOf("Nichi");		
		if(mess.toLowerCase().indexOf("nichi")>=0)
		{
			System.out.println("Nichi is a sentence");
		}
		else
		{
			System.out.println(mess);
		}
		
	}
}
		
		

	


