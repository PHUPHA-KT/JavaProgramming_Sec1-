import javax.swing.*;
import java.util.*;
import java.text.*;
public class Example3 {
	
	public static void main(String[] args) {
		
	DecimalFormat frm = new DecimalFormat("#,###.0");
	double weight = Double.parseDouble(JOptionPane.showInputDialog("Input Weight : "));
	double height = Double.parseDouble(JOptionPane.showInputDialog("Input height : "));
	double cm = height/100;
	double bmi = weight/(cm*cm);
	String g;
	if (bmi>=30)
	{
		g = "Obesity";
	}
	else if (bmi>=25.0)
	{
		g = "Overweight";
	}
	else if (bmi>=18.5)
	{
		g = "Normal-weigh";
	}
	else 
	{
		g = "Underweight";
	}
	
	//JOptionPane.showMessageDialog(null,"BMI = "+frm.format(bmi)+"\nYou're "+g);
	JOptionPane.showMessageDialog(null,"BMI = "+String.format("%.1f",bmi)+"\nYou're "+g);
	
	}

}
