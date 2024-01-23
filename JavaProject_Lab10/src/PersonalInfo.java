
public class PersonalInfo {
	private Person name;
	private Date bDay;
	private int personID;
	
	PersonalInfo() {
		//้รียนใช้ const
		name = new Person(); //firstName and lastName = ""
		bDay = new Date(); // dDay =1 dMonth = 1 dYear=1900
		personID = 0; 
	}
	
	PersonalInfo(String first,String last,int month,int day, int year, int ID) {
		name = new Person(first,last);
		bDay = new Date(month,day,year);
		personID = ID;
	}
	
	public void setPersonalInfo(String first,String last,int month,int day, int year, int ID) {
		name.setName(first, last);
		bDay.setDate(month, day, year);
		personID = ID;
	}
	
	public String toString() {
		return "Name : "+name.toString()+
				"\nDate of birth : "+bDay.toString()+
				"\nPersonal ID : "+personID;
	}
	

}
