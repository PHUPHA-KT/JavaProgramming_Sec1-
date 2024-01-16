import java.time.Year;

public class Book {
	private static String title;
	private static float price;
	private static int publishyear;
	
public void setTitle(String title) {
	this.title = title;
}
public String getTitle() {
	return title;
}
public void setPrice(float price) {
	this.price = price;
}
public float getPrice() {
	return price;
}
public void setPublishyear(int year){
	this.publishyear = year;
}
public int getPublishyear() {
	return publishyear;
}
public int getTotalyear(){
	return Year.now().getValue()-getPublishyear();
}
public String toString() {
	return "Title: "+getTitle()+"published for "+getTotalyear()+"year ("+getPrice()+" Baht).";
}
}
