import java.util.*;
public class TestPiggyBank {

	static PiggyBank pb = new PiggyBank();
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		inputCoin();
		/*pb.setPiggyBank(500);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addTwo (34);
		System.out.println("Add 2 Baht Money : " + 34);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addTen (13);
		System.out.println("Add 10 Baht Money : " + 13);
		System.out.println("Money Total : " + pb.getTotal()); */
		pb.addFive(100);

	}
	public static void inputCoin() {
		System.out.println("Money total : "+ pb.getTotal());
		System.out.print("Please difine size  of PiggyBank : ");
		int sizeofPiggyBank = scan.nextInt();
		pb.setPiggyBank(sizeofPiggyBank);
		System.out.println("size of your PiggyBank: "+pb.getPiggyBank());
		MainMenu();
	}
	
	public static void MainMenu(){
		while(true) {
			System.out.print("========================="+
								"\nMenu of PiggyBank"+
								"\n========================="+
								"\n[1] one baht."+
								"\n[2] two baht."+
								"\n[3] five baht."+
								"\n[4] ten baht."+
								"\n[5] Exit."+
								"\n=========================");
			System.out.print("\nPlease Select Menu[1-5] : ");
			int menu = scan.nextInt(); 
			if(menu>0&&menu<6) {
				
				if(menu==5){
					break;
				}else if(menu==1) {
					System.out.print("Insert 1 Baht Money. : ");
					int one = scan.nextInt();
					pb.addOne(one);
					System.out.println("Money Total : " + pb.getTotal());
				}
				else if(menu==2) {
					System.out.print("Insert 2 Baht Money. : ");
					int two = scan.nextInt();
					pb.addTwo(two);
					System.out.println("Money Total : " + pb.getTotal());
				}
				else if(menu==3) {
					System.out.print("Insert 5 Baht Money. : ");
					int five = scan.nextInt();
					pb.addFive(five);
					System.out.println("Money Total : " + pb.getTotal());
				}
				else if(menu==4) {
					System.out.print("Insert 10 Baht Money. : ");
					int ten = scan.nextInt();
					pb.addTen(ten);
					System.out.println("Money Total : " + pb.getTotal());
				}
				
				
			}
			
			
		
		}
	}
}


