package example9;

public class example9_7 {
	public static void main(String[] args) {
		System.out.println("Before creating object");
		System.out.println("The number of Circle object is "+example9_6.numberOfObjects);
		
		// Create c1
		example9_6 c1 = new example9_6();
		
		System.out.println("\nAfter creating c1");
		System.out.println("c1: radius(" + c1.radius + ") and number of Circle objects(" + c1.numberOfObjects + ")");
		
		// Create c2
		example9_6 c2 = new example9_6(5);
		
		// Modify c1
		c1.radius = 9;
		
		// Display c1 and c2 AFTER c2 was created
		System.out.println("\nAfter creating c2 and modifying c1");
		System.out.println("c1: radius(" + c1.radius + ") and number of Circle objects(" + c1.numberOfObjects + ")");
		System.out.println("c2: radius(" + c2.radius + ") and number of Circle objects(" + c2.numberOfObjects + ")");
	}
}
