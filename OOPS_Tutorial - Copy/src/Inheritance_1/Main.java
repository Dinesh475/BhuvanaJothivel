package Inheritance_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Telephone Bill Number");
		int a = sc.nextInt();
		System.out.println("Enter the Customer Name");
		sc.nextLine();
		String b = sc.nextLine();
		System.out.println("Enter the number of calls made");
		int c = sc.nextInt();
		System.out.println("Enter the costs per call");
		double d = sc.nextDouble();
		System.out.println("Enter the Current Bill Number");
		int e = sc.nextInt();
		System.out.println("Enter the Customer Name");
		sc.nextLine();
		String f = sc.nextLine();
		System.out.println("Enter the number of units consumed");
		int g = sc.nextInt();
		System.out.println("Enter the costs per unit");
		double h = sc.nextDouble();
		Bill bill = new Bill(a,b);
		Bill bill1 = new Bill(e,f);
		bill.genetrateBill();
		TelePhoneBill tpbill = new TelePhoneBill(a,b,c,d);
		tpbill.genetrateBill();
		bill1.genetrateBill();
		currentBill cbill = new currentBill(e,f,g,h);
		cbill.genetrateBill();


	}

}
