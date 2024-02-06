import java.util.*;
import java.io.*;
public class Example1202 {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		System.out.print("Input Section : ");
		int section = input.nextInt();
		header(section);
		showListStudent(section);

	}
	public static void showListStudent(int section ) throws IOException{
		BufferedReader read = new BufferedReader(new FileReader("D:\\txtFile\\List107.txt"));
		String temp = "";
		
		while ((temp = read.readLine()) !=null) {
			String[] data = temp.split("\t");
			double mid = Double.parseDouble(data[4]);
			double Final = Double.parseDouble(data[5]);
			int sectionFile = Integer.parseInt(data[3]);
			if(sectionFile==section) {
			System.out.println(data[0]+"\t"+data[2]+"\t"+mid+"\t"+Final+"\t"+findResult(mid,Final));
		
			}
		}
		
		
	}
	public static String findResult(Double Mid, Double Final)
	{
		if(Mid+Final>=40) {
			return "PASS";
		}
		else {
			return "FALL";
		}
		
	}
	
	public static void header(int section) {
		System.out.println("*****************************************************************");
		System.out.println("\t\tList of Data for Section "+(section == 1 ? "1":"2"));
		System.out.println("*****************************************************************");
	}
}
