package Abstraction_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("Circle\nSquare\nRectangle\nEnter the shape name");
		String name = in.nextLine();
		if(name.equalsIgnoreCase("Circle")) {
			System.out.println("Enter the radius");
			int rad = in.nextInt();
			Circle c = new Circle(name, rad);
			System.out.printf("Area of circle is %.2f" ,c.calculateArea());
			
		}
		else if(name.equalsIgnoreCase("Square")) {
			System.out.println("Enter the sides");
			int side = in.nextInt();
			Square s = new Square(name, side);
			System.out.printf("Area of square is %.2f" ,s.calculateArea());
		}
		else if(name.equalsIgnoreCase("rectangle")) {
			System.out.println("Enter the length");
			int len = in.nextInt();
			System.out.println("Enter the breadth");
			int bre = in.nextInt();
			Rectangle r = new Rectangle(name, len, bre);
			System.out.printf("Area of rectangle is %.2f" ,r.calculateArea());
		}


	}

}
