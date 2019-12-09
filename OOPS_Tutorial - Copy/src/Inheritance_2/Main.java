package Inheritance_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Menu\n1. Create a Student\n2. Create a UGStudent\n3. Create a PGStudent");
		System.out.println("Enter your choice");
		int ch = sc.nextInt();
		sc.nextLine(); 
		switch(ch) {
		case 1:{
			System.out.println("Enter Name");
			String name = sc.nextLine(); 
			System.out.println("Enter Id");
			String id = sc.nextLine(); 
			System.out.println("Enter Age");
			int age = sc.nextInt();
			System.out.println("Enter Grade");
			double grd = sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter Address");
			String add = sc.nextLine();
			Student s = new Student(name,id,age,grd,add);
			s.display();
			if(s.isPassed())
				System.out.println("Result: pass");
			else
				System.out.println("Result: fail");	
			break;
		}
		case 2: {
			System.out.println("Enter Name");
			String name = sc.nextLine(); 
			System.out.println("Enter Id");
			String id = sc.nextLine(); 
			System.out.println("Enter Age");
			int age = sc.nextInt();
			System.out.println("Enter Grade");
			double grd = sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter Address");
			String add = sc.nextLine();
			System.out.println("Enter Degree");
			String deg = sc.nextLine();
			System.out.println("Enter Stream");
			String strm = sc.nextLine();
			UGStudent ugs = new UGStudent(name,id,age,grd,add,deg,strm);
			ugs.display();
			if(ugs.isPassed())
				System.out.println("Result: pass");
			else
				System.out.println("Result: fail");	
			break;
		}
		case 3:{
			System.out.println("Enter Name");
			String name = sc.nextLine(); 
			System.out.println("Enter Id");
			String id = sc.nextLine(); 
			System.out.println("Enter Age");
			int age = sc.nextInt();
			System.out.println("Enter Grade");
			double grd = sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter Address");
			String add = sc.nextLine();
			System.out.println("Enter Specialization");
			String spe = sc.nextLine();
			System.out.println("Enter number of papers published");
			int pp = sc.nextInt();
			PGStudent pgs = new PGStudent(name,id,age,grd,add,spe,pp);
			pgs.display();
			if(pgs.isPassed())
				System.out.println("Result: pass");
			else
				System.out.println("Result: fail");	
		}		
		}


	}

}
