import javax.swing.*;
public class Lab705 {

	public static void main(String[] args) {
		int[] num = new int[5];
		for (int i = 0 ; i<num.length;i++) {
			num[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Input number"+(i+1)+":"));
		}
		showEven(num);
		showOdd(num);

	}
	public static void showEven(int[] nums) {
		String dis = "";
		for(int _nums : nums) {
			if(_nums%2==0) {
				dis += _nums + " ";
			}
		}
		JOptionPane.showMessageDialog(null, "List of even numbr:\n"+dis);
	}
	public static void showOdd(int[] nums) {
		String dis = "";
		for(int _nums : nums) {
			if(_nums%2!=0) {
				dis += _nums + " ";
			}
		}
		JOptionPane.showMessageDialog(null, "List of odd numbr:\n"+dis);
	}

}
