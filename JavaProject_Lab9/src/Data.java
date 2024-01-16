import java.text.DecimalFormat;

public class Data {
	private static int year,month,day;

	public Data(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public int getYear() {
		return this.year;
	}
	public int getMonth() {
		return this.month;
	}
	public int getDay() {
		return this.day;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public String toString() {
		return String.format("%02d/%02d/%4d",month,day,year);
	}
	public void setDate(int year,int month , int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
}

