import javax.swing.*;
public class Lab602 {

	public static void main(String[] args) {
		
		while(true) {
			String year = JOptionPane.showInputDialog(null,"Input Year");
		int nyear = Integer.parseInt(year);
		if(checkYear(nyear)==true)
		{
		
			JOptionPane.showMessageDialog(null,(isLeapYear(nyear)==true)?year+" is Leap yea":year+" is NOT Leap yea" );
			break;
			/*if(isLeapYear(nyear)==true)
			{
				JOptionPane.showMessageDialog(null, year+" is Leap yea");
				break;
			}
			else
			{
				JOptionPane.showMessageDialog(null, year+" is NOT Leap yea");
				break;
			}*/
		}
		else {
			JOptionPane.showMessageDialog(null,"Please input year between 1000-3000,\ninput year again");
		}
		
		
	}

}
	public static boolean isLeapYear(int year) {
		if(year%4 == 0&&year%100!=0) {
			return true;
		}
		else if(year%100==0&&year%400==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean checkYear(int year) {
		if(year>=1000&&year<=3000)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
