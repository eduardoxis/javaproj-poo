

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int x;
	
	System.out.println("digite um numero diferente de zero");
	x = sc.nextInt();
	
	int soma = 0;
	
	while (x != 0) {
		
		soma += x;
		
		
		
	}
	
	
	System.out.println(soma);
	
	sc.close();
	}

}
