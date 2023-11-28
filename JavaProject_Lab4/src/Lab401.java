
import java.util.*;
public class Lab401 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int x,y;
		System.out.print("Input value of X: ");
		x = scan.nextInt();
		System.out.print("Input value of Y: ");
		y = scan.nextInt();
		System.out.println();
		
		while(y<=x)
		{			
				System.out.print("Input value of Y, again: ");
				y = scan.nextInt();
		}
		int sum =x+1,insum = x + sum,newsum=0;
		System.out.println(x+" + "+sum+" = "+insum);
		while(sum<=y) 
		{
			newsum = insum + sum;
			System.out.println(insum+" + "+sum+" = "+newsum);
			insum=newsum;
			sum++;
			
			
		}

	}

}
