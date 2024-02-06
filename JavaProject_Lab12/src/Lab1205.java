import java.io.*;
import java.util.*;
public class Lab1205 {

	public static void main(String[] args)  throws IOException{
		Scanner read = new Scanner(new File("d:\\txtFile\\student.txt"));
		int i =1;
		while(read.hasNext()) {
			String ID = read.next();
			
			read.next();
			String name = read.next().substring(0,1);
			String lastname = read.next();
			double grade = read.nextDouble();
			read.next();
	
			System.out.println(i+"\t"+ID+"\t"+Level(ID)+"\t"+name+"."+lastname+"\t"+grade+"\t"+Status(grade));
			i++;
		}
		

	}
	
	public static String Level(String id){
		
		if(id.substring(0,2) =="18") {
			return "3th";
		}else {
			return "4th";
		}
			
		
	}
	
	public static String Status(double grade){
		if(grade >= 2.00) {
			return "PASS";
		}else {
			return "Critical";
		}
	}
	
	public static void header() {
		System.out.println("NO.\tID\tLevel\tname\tgrade\tstatus");
		System.out.println("*************************************************************");
	}
	
}
