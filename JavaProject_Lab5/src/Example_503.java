import java.util.*;
public class Example_503 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input a sentence :");
		String sent = scan.nextLine();
		while(!sent.endsWith(".")) {
			System.out.print("Input a sentence,again :");
		}
		System.out.println();
		int space = 0;
		for(int i =0;i<sent.length();i++) {
			if(sent.charAt(i)==' ')
			{
				space++;
			}
		}
		System.out.println("This sentence has "+space+" spacebar.");
		System.out.println("This sentence has "+(space+1)+" spacebar.");

	}

}
