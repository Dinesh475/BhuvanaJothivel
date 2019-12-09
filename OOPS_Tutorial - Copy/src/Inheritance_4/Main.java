package Inheritance_4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Name of the Student");
		String name = in.nextLine();
		System.out.println("Enter the age of the Student");
		int age = in.nextInt();
		System.out.println("Enter the Gender of the Student");
		in.nextLine();
		String gender = in.nextLine();
		System.out.println("Enter the Id Number of the Student");
		String idNum = in.nextLine();
		System.out.println("Enter the Major of the Student");
		String major = in.nextLine();
		System.out.println("Enter the CGPA of the Student");
		double cgpa = in.nextDouble();
		in.nextLine();	
		System.out.println("Enter the year of studing of the Student");
		int year = in.nextInt();
		CollegeStudent cs = new CollegeStudent(name,gender,idNum,age,cgpa,major,year);
		
		System.out.println(cs.toString());


	}

}
