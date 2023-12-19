import java.util.*;
import javax.swing.*;

public class Lab601 {
		public static void main(String[] args) {
			while(true) {
			String email=JOptionPane.showInputDialog(null,"input your Emiil");
			email = email.toLowerCase();
			if(checkEmail(email)==true)
			{
				JOptionPane.showMessageDialog(null, "Your e-mail is "
						+email);
				break;
			}
			/*else
			{
				JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail dot com");
			}*/
			
		}
			
					
	}
		public static boolean checkEmail(String email) {
			if(email.endsWith("@hotmail.com")||email.endsWith("@gmail.com"))
			{
				return true;
			}
			else {
				return false;
			}
		}
}
