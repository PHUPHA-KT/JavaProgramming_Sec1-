import java.util.*;
import java.io.*;
public class Lab1201 {

	public static void main(String[] args) throws IOException{
		Scanner read = new Scanner(new File("D:\\txtFile\\MemberLogin.txt"));
		int i = 1;
		while(read.hasNext()) {
			String name = read.next();
			String lastname = read.next().substring(0,1);
			read.next();
			String email = read.next();
			
			System.out.println(lastname+"."+name+" ("+email+")");
		}

	}

}
