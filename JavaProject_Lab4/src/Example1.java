import java.util.*;
public class Example1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input number :");
		int fnum = input.nextInt();
		int crnum;
		while(true)
		{
			System.out.print("Input number :");
			crnum = input.nextInt();
			
			if(crnum<fnum)
			{
				System.out.println("Bye Bye");
				break;
			}
			fnum=crnum;
		}

	}

}
