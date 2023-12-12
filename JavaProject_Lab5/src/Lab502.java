import java.util.Scanner;

public class Lab502 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		System.out.print("Input some sentence : ");
		String sent = scan.nextLine();			
		while(!(sent.endsWith("."))){
			System.out.print("The sentence must end wish full stop point: ");
			sent = scan.next();			
		}
		System.out.println();
		int start=0;
		for(int i =0;i<sent.length();i++) 
		{
			if(sent.charAt(i)==' '|| i == sent.length()-1)
			{
				System.out.println(sent.trim().substring(start, i+1));
				start=i+1;
			}
		}
		

	}

}
