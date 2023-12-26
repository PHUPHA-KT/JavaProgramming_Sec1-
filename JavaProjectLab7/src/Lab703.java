import java.util.Scanner;

public class Lab703 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = {78, 36, 58, 41, 25, 92, 75};
		System.out.print("Input index of array : ");
		int nums = scan.nextInt();
		while(nums<0||nums>6)
		{
			
			System.out.print("Input index of array, again : ");
			nums = scan.nextInt();
			
			
		}
		System.out.println();
		System.out.println("Value in current in is "+num[nums]);    
				if(nums != (num.length-1)) {
					System.out.println("Value in next    in is "+num[nums+1]);
				}else
				{
					System.out.println("Sorry "+nums+" is the last index array");
				}
			}
			
		

	}


