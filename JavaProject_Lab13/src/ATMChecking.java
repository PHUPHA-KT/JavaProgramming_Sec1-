
public class ATMChecking {
	private int money;
	
	public void ATMChecking(String id,String pass,int money) {
		id = "";
		pass = "";
		this.money = money;
		
	}
	
	public boolean checkBookBank() {
		if(money%2==0) {
			return true;
		}
		else 
		{
		return false;
		}
	}

}
