import java.util.*;
public class Example_501 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = "";
		String type = "";
			
		while(true){
			System.out.print("Enter world : ");
			type = scan.next();
			if(type.equalsIgnoreCase("stop"))
					break;
			word =word + type+" ";
		}
		System.out.print(word.toUpperCase());
		
		
		
	}

}
