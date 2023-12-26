

public class Lab_Example701 {

	public static void main(String[] args) {
		int[] num = {12, 50, 93, 45, 75, 52 , 80};
		for (int i = 0 ; i<num.length;i++) {
			System.out.println("num["+i+"] = "+num[i]);
		}
		System.out.println();
		System.out.println("foreace");
		int j = 0;
		for (int _num : num)
		{
			
			System.out.println("num["+j+"] = "+_num); // ใช้ตัวแปใหม่ _num
			j ++;
		}
		System.out.println();
		printArrayNumber(num);

	}
	public static void printArrayNumber(int[] nums) {
		System.out.println("Using method to display value of array");
		for (int i = 0 ; i<nums.length;i++) {
			System.out.println("num["+i+"] = "+nums[i]);
		}
	}

}
