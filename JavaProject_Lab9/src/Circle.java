
public class Circle {
	private static double DFradius = 1;
	private static String DFcolor = "red";
	
	private double radius;
	private String color;

public Circle() {
	radius = DFradius;
	color = DFcolor;
}
public Circle(double radius) {
	this.radius = radius;
	this.color = DFcolor;
}
public Circle(double radius,String color) {
	this.radius = radius;
	this.color = color;
}
public double getRdius() {
	return this.radius;
}
public void setRadius(double radius) {
	this.radius = radius;
}
public String getColor() {
	return this.color;
}
public void setColor(String color) {
	this.color = color;
}
public String toString() {
	return "Circle[radius="+getRdius()+",color="+getColor()+"]";
}
public double getArea() {
	return 2*Math.PI*(radius);
}
public double getCircumference() {
	return this.radius;
}
}
