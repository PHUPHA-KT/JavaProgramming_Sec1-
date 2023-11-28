import java.util.*;
import java.text.*;
public class PensionContributionCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("$#,###.00");
		// TODO Auto-generated method stub
		final int SALARY_CEILING = 6000;
		 final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
		 final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
		 final double EMPLOYEE_RATE_55_TO_60 = 0.13;
		 final double EMPLOYER_RATE_55_TO_60 = 0.13;
		 final double EMPLOYEE_RATE_60_TO_65 = 0.075;		
		 final double EMPLOYER_RATE_60_TO_65 = 0.09;
		 final double EMPLOYEE_RATE_65_ABOVE = 0.05;
		 final double EMPLOYER_RATE_65_ABOVE = 0.075;
		 // Declare variables
		 int salary, age; // to be input
		 int contributableSalary;
		 double employeeContribution, employerContribution, totalContribution;
		 System.out.print("Enter the monthly salary: $");
		 salary = scan.nextInt();
		 System.out.print("Enter the age: ");
		 age = scan.nextInt();
		 
		 // Check the contribution cap
		
		 // Compute various contributions in "double" using a nested-if to handle 4 cases
		 if(salary>6000) {
			 salary = SALARY_CEILING;
		 }
		 if (age <= 55) 
		 { // 55 and below
			 
			 System.out.println("The employee's contribution is: "+frm.format(employeeContribution=salary*EMPLOYEE_RATE_55_AND_BELOW));
			 System.out.println("The employer's contribution is: "+frm.format(employerContribution=salary*EMPLOYER_RATE_55_AND_BELOW));
			 System.out.println("The total contribution is:"+frm.format(totalContribution=employeeContribution+employerContribution));
			 
		 } else if (age <= 60)
		 { // (60, 65]
			 System.out.println("The employee's contribution is: "+frm.format(employeeContribution=salary*EMPLOYEE_RATE_55_TO_60));
			 System.out.println("The employer's contribution is: "+frm.format(employerContribution=salary*EMPLOYER_RATE_55_TO_60));
			 System.out.println("The total contribution is:"+frm.format(totalContribution=employeeContribution+employerContribution));
		 } else if (age <= 65) 
		 { // (55, 60]
			 System.out.println("The employee's contribution is: "+frm.format(employeeContribution=salary*EMPLOYEE_RATE_60_TO_65));
			 System.out.println("The employer's contribution is: "+frm.format(employerContribution=salary*EMPLOYER_RATE_60_TO_65));
			 System.out.println("The total contribution is:"+frm.format(totalContribution=employeeContribution+employerContribution));
		 } else { // above 65
			 System.out.println("The employee's contribution is: "+frm.format(employeeContribution=salary*EMPLOYEE_RATE_65_ABOVE));
			 System.out.println("The employer's contribution is: "+frm.format(employerContribution=salary*EMPLOYER_RATE_65_ABOVE));
			 System.out.println("The total contribution is: "+frm.format(totalContribution=employeeContribution+employerContribution));
		 }
		 	 
	}

}
