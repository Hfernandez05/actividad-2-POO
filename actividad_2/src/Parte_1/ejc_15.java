package Parte_1;

import java.util.*;

public class ejc_15 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite el peso de la bola A: ");
		double pesoA = entrada.nextDouble();
		System.out.println("Digite el peso de la bola B: ");
		double pesoB = entrada.nextDouble();
		System.out.println("Digite el peso de la bola C: ");
		double pesoC = entrada.nextDouble();
		System.out.println("Digite el peso de la bola D: ");
		double pesoD = entrada.nextDouble();
		
		if ( (pesoA == pesoB) && (pesoA == pesoC)) {
			System.out.println("La bola de peso diferente es la bola D");
			if (pesoD > pesoA) {
				System.out.println("Es de mayor peso");
			}else {System.out.println("Es de menor peso");}
		}
		if ( (pesoA == pesoB) && (pesoA == pesoD)) {
			System.out.println("La bola de peso diferente es la bola C");
			if (pesoC > pesoA) {
				System.out.println("Es de mayor peso");
			}else {System.out.println("Es de menor peso");}
		}
		if ( (pesoA == pesoC) && (pesoA == pesoD)) {
			System.out.println("La bola de peso diferente es la bola B");
			if (pesoB > pesoA) {
				System.out.println("Es de mayor peso");
			}else {System.out.println("Es de menor peso");}
		}
		if ( (pesoB == pesoC) && (pesoB == pesoD)) {
			System.out.println("La bola de peso diferente es la bola A");
			if (pesoA > pesoB) {
				System.out.println("Es de mayor peso");
			}else {System.out.println("Es de menor peso");}
		}
	}

}
