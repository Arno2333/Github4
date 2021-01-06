package example9;

class example9_2 {
	/**Main method*/
	public static void main(String args[]) {
		// Create a circle with radius 1
		example9_2 circle1 = new example9_2();
		System.out.println(" The area of the circle of radius " + circle1.radius + " is " + circle1.getArea()) ;
		
		// Create a circle with radius 25
		example9_2 circle2 = new example9_2(25);
		System.out.println(" The area of the circle of radius " + circle2.radius + " is " + circle2.getArea()) ;
		
		// Create a circle with radius 125
		example9_2 circle3 = new example9_2(125);
		System.out.println(" The area of the circle of radius " + circle3.radius + " is " + circle3.getArea()) ;
		
		// Modify circle radius
		circle2.radius=100;
		System.out.println(" The area of the circle of radius " + circle2.radius + " is " + circle2.getArea()) ;
	}

	double radius;
	
	//Construct a circle with radius 1
    example9_2(){
		radius = 1;
	}
	
    //Construct a circle with a specified radius
	example9_2(double newRadius){
		radius = newRadius;
	}
	
	//Return the area of this circle
	double getArea() {
		return radius*radius*Math.PI;
	}
	
	//Return the parameter of this circle
	double getPerimeter() {
		return 2*radius*Math.PI;
	}
	
	//Set a new radius for this circle
	void setRadius(double newRadius) {
		radius = newRadius;
	}

}
