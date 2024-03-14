package Parte_1;

import java.util.*;

public class ejc_11 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("digite el numero 1: ");
		int num1 = entrada.nextInt();
		System.out.print("digite el numero 2: ");
		int num2 = entrada.nextInt();
		System.out.print("digite el numero 3: ");
		int num3 = entrada.nextInt();
		
		if ((num1 > num2) && (num1 > num3)) {
			System.out.println("El numero mayor es: "+ num1);
		}
		if ((num2 > num1) && (num2 > num3)) {
			System.out.println("El numero mayor es: "+ num2);
		}
		if ((num3 > num1) && (num3 > num2)) {
			System.out.println("El numero mayor es: "+ num3);
		}
	}

}
