import java.util.Scanner;

import javax.swing.JOptionPane;

public class Lab706 {

	public static void main(String[] args) {
		
		int[] nums = {25, 78, 41, 22, 36, 85, 37}; 
		int index = Integer.parseInt(JOptionPane.showInputDialog(null,"input index of array : "));
		while(checkIndex(nums,index)==true) {
			index = Integer.parseInt(JOptionPane.showInputDialog(null,"input index of array, again : "));
		}
		int cur = currentData(nums,index);
		int pre = prevData(nums,index);
		int next = nextData(nums,index);
		if(next==-1) {
			String nonext = "No next data";
		}
		JOptionPane.showMessageDialog(null, "Current data,nums["+index+"]"+" is "+cur+
											"Previous data,nums["+(index+1)+"]"+" is"+pre?);

	}
	
	public static boolean checkIndex(int[] nums,int index) {
		boolean ch = false;
		if(index<0||index>6) {
			ch = true;
		}
		return ch;
	}
	
	public static int currentData(int[] nums,int index) {
		int num = 0;
		num =nums[index];
		return num;
	}
	
	public static int prevData(int[] nums,int index) {
		int num = 0;
		num =nums[index-1];
		return num;
	}
	
	public static int nextData(int[] nums,int index) {
		int num = 0;
		if(index != (nums.length-1)){
		num =nums[index+1];
		}else {
			num=-1;
		}
		return num;
	}
	

}
