package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rectangle rc = new Rectangle();
		
		System.out.println("Enter of Width: ");
		rc.width = sc.nextDouble();
		
		System.out.println("Enter of Height: ");
		rc.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", rc.area());
		System.out.printf("PERIMETER = %.2f%n", rc.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rc.diagonal());
		
		
		
		
		
		
		sc.close();
	}

}
