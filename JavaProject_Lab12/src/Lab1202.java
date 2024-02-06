import java.util.*;
import java.io.*;
public class Lab1202 {

	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		System.out.print("input your email :");
		String email = input.nextLine();
		System.out.println();
		Scanner read = new Scanner(new File("d:\\txtFile\\MemberLogin.txt"));
		boolean ch =false;
		while(read.hasNext()) {
			read.next();
			read.next();
			String pass = read.next();
			String chemail = read.next();
			if(chemail.equalsIgnoreCase(email)) {
				System.out.println("Your password is : "+pass);
				ch = true;
				break;
			}
			
		}
		if(ch==false) {
			System.out.println("The data not found...");
		}

	}

}
