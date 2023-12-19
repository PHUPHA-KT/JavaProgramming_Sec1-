import java.util.Scanner;

public class Lab604 {
	static Scanner input = new Scanner(System.in);
	static String studentid,sid;
	static int subid;
	boolean stdit,subit;

	public static void main(String[] args) {
		inputStudent();
		
		

	}
	public static void inputStudent() {
		
		while(true) {
		System.out.print("Enter student id : ");
		studentid = input.nextLine();
		System.out.print("Enter subject id : ");
		subid = input.nextInt();
		sid = subid+"";
		isLength(studentid,sid);
		if(isLength(studentid,sid)==true)
		{
			System.out.println("");
			displayData(isITStudent(studentid),isITSubject(sid));
			break;
		}
		
	}
		
		
}
	public static boolean isLength(String sid,String sbid){
		if(sid.length()==10||sbid.length()==7)
		{
			return true;
		}
		else
		{
		return false;
		}
}
	
	public static boolean isITStudent(String sid) {
		if(sid.substring(0,3).equals("211")&&sid.substring(3,6).equals("311"))
		{
			return true;
		}else
		{
			return false;
		}
		
	}
	
	public static boolean isITSubject(String sid) {
		if(sid.substring(0,2).equals("21")&&sid.substring(4,5).equals("1"))
		{
			return true;
		}else
		{
			return false;
		}
	}
	public static void displayData(boolean stdit,boolean svbit)  {
		if (stdit==true)
		{
			System.out.println("studentid "+studentid+" Ist year student in IT");
		}
		else
		{
			System.out.println("studentid "+studentid+" is not Ist year student in IT");
		}
		if(svbit==true)
		{
			System.out.println("Enrool in course for Year 1");
		}
		else
		{
			System.out.println("not Enrool in course for Year 1");
		}
		
	}

}
