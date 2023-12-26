import java.util.*;
public class Lab_Example703 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		for (int i =0 ; i<num.length;i++) {
			System.out.print("Input number "+(i+1)+" :" );
			num[i]= scan.nextInt();
			
		}		
		System.out.println("Summation of positive number is "+sumOfPos(num));

	}
	public static int sumOfPos(int[] nums) {
		int sum = 0;
		for (int _nums : nums) {
			if(_nums>0)
			{
			sum+=_nums;
			}
		}
		return sum;
		
	}

}
