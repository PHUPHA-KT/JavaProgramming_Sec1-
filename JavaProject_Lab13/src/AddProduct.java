import java.util.*;
import java.io.*;
public class AddProduct {

	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		
		PrintWriter writeFile = new PrintWriter(new FileWriter("D:\\product.txt",true));
		
		System.out.print("Product id: ");
		String pdid = input.next();
		System.out.print("Product Name: ");
		String pdname = input.next();
		System.out.print("Product Unit: ");
		int pdunit = input.nextInt();
		System.out.print("Product Price: ");
		float pdprice = input.nextFloat();
		
		writeFile.print(pdid+","+pdname+","+pdunit+","+pdprice);
		System.out.println("Write file already...");
		
		writeFile.close();
		
		

	}

}
