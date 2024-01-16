import java.util.Scanner;

public class testAuthor {

	public static void main(String[] args) {
		
		String name,email;
		char gender;
		Scanner input = new Scanner(System.in);
		System.out.print("Input Author name : ");
		name = input.nextLine();
		System.out.print("Input Author email : ");
		email = input.nextLine();
		System.out.print("Input Author gender : ");
		gender = input.next().charAt(0);
		Author d1 = new Author(name,email,gender);;
		System.out.println("\n"+d1);

	}

}
