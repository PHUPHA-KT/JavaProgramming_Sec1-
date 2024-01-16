
public class TestCircle {

	public static void main(String[] args) {
		 // Test all constructors and toString()
		 Circle c1 = new Circle(1.1, "blue");
		 System.out.println(c1); // implicitly run toString()
		 //Circle[radius=1.1, color=blue]
		 Circle c2 = new Circle(2.2);
		 System.out.println(c2);
		 //Circle[radius=2.2, color=red]
		 Circle c3 = new Circle();
		 System.out.println(c3);
		 
		 c1.setRadius(3.3);
		 c1.setColor("green");
		 System.out.println(c1);
		 System.out.println("the radius is: "+c1.getRdius());
		 System.out.println("the color is: "+c1.getColor());
		 
		 System.out.printf("The area is: %.2f%n",c1.getArea());
		 System.out.printf("The circu,ference is : %2f",c1.getCircumference());

	}
}
