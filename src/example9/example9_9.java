package example9;

public class example9_9 {
	public static void main(String[] args) {
		// Create a circle with radius 5.0
		example9_8 myCircle = new example9_8(5.0);
		System.out.println("The area of the circle of radius "+ myCircle.getRadius() +" is " + myCircle.getArea());

		// Increase myCircle ¡¯ s radius by 10%
		myCircle. setRadius(myCircle.getRadius() * 1.1);
		System.out.println("The area of the circle of radius "+ myCircle.getRadius() +" is " + myCircle.getArea());
		
		System.out.println("The number of objects created is " + example9_8.getNumberOfObjects());
	}
}
