
public class Author {
	private static String name,email;
	private static char gender;
	
	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public Author(String name, String email) {
		this.name = name;
		this.email = email;
		
	
	}
	public Author() {
		
	}
	public String getName() {
		return this.name;
	}
	public String getEmail() {
		return this.email;
	}
	public String getGenderName() {
		if(this.gender=='F'||this.gender=='f') {
			return "female";
		}
		else if(this.gender=='M'||this.gender=='m') {
			return "male";
		}
		else {
			return "null";
		}
	}
	public String toString() {
		return "Author name: "+getName()+"("+getEmail()+";"+getGenderName()+")";
	}

}
