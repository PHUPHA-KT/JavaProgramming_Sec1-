import java.util.Scanner;

import javax.swing.JOptionPane;
public class Example_503_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//System.out.print("Input a sentence :");
		String sent = JOptionPane.showInputDialog(null,"Input a sentence :");
		while(!sent.endsWith(".")) {
			//System.out.print("Input a sentence,again :");
			sent = JOptionPane.showInputDialog(null,"Input a sentence,again :");
		}
		System.out.println();
		int space = 0;
		for(int i =0;i<sent.length();i++) {
			if(sent.charAt(i)==' ')
			{
				space++;
			}
		}
		JOptionPane.showMessageDialog(null, "This sentence has "+space+" spacebar."+
				"\nThis sentence has "+(space+1)+" spacebar.");
		//System.out.println("This sentence has "+space+" spacebar.");
		//System.out.println("This sentence has "+(space+1)+" spacebar.");

	}

}
