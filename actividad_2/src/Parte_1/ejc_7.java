package Parte_1;

import java.util.*;

public class ejc_7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite el valor de A: ");
		int A = entrada.nextInt();
		System.out.print("Digite el valor de B: ");
		int B = entrada.nextInt();
		
		if (A > B) {
			System.out.println("A es mayor que B");
		}else{ 
		if (A == B) {
			System.out.println("A es igual que B");
		}else {
			System.out.println("A es menor que B");
		}
			
		}	

	}

}
