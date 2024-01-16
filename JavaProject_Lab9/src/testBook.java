import java.util.Scanner;

public class testBook {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Book d1 = new Book();
		System.out.print("Input book title : ");
		d1.setTitle(input.nextLine());		
		System.out.print("Input book price : ");
		d1.setPrice(input.nextFloat());
		System.out.print("Input book publish year : ");
		d1.setPublishyear(input.nextInt());
		/*test
		***********************************
		d1.setTitle("The Blue Moon");
		d1.setPrice(290.15f);
		d1.setPublishyear(2011);
		************************************/
		
		System.out.println(d1);
	}

}
