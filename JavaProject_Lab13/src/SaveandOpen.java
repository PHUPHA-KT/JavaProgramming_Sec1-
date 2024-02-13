import java.util.*;
import java.io.*;
public class SaveandOpen extends Employee {
	private String name;
	private String dept;
	
	public void insert()  throws IOException{
		Scanner input = new Scanner(System.in);
		PrintStream writeFile = new PrintStream((new File("D:\\employee.txt")));
		String answer;
		
		
		do {
			header();
			System.out.print("Enter name: ");
			name = input.next();
			System.out.print("Enter department: ");
			dept = input.next();
			System.out.print("Enter data again : ");
			answer = input.next();
			
			writeFile.println(name+"\t"+dept);
			
			
		}while(answer.equalsIgnoreCase("y"));
		writeFile.close();
	
		
	}
	
	public void read() {
		int i = 0;
		try {
			Scanner readFile = new Scanner(new File("D:\\\\employee.txt"));
			boolean choice = false;
			header();
			
			while(readFile.hasNext()) {
				name = readFile.next();
				dept = readFile.next();
				if(dept.equalsIgnoreCase(super.getDept())) {
					i++;
					
					System.out.println("1) "+name);
					choice = true;
	
				}
		
				if(choice==false) {
					
					System.out.println("\nSorry,no department:"+super.getDept()+" in file");
					break;
				}
				
			}
			
		}catch(IOException e) {
			System.out.print("Sorry file not found.");
			
		}
		if(i>0) {
			header();
			System.out.print("Employee in dept "+super.getDept()+" is "+i+" person.");
		}

		
	}

}
