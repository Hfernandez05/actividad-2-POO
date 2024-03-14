package Parte_1;

import java.util.*;

public class ejc_24 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("ingrese el peso de las esferas A,B y C respectivamente: ");
		
		double pesoA = entrada.nextDouble();
		double pesoB = entrada.nextDouble();
		double pesoC = entrada.nextDouble();
		
		if ( (pesoA > pesoB) && (pesoA > pesoC) ) {
			System.out.println("La esfera de mayor peso es la esfera A");
		}
		if ( (pesoB > pesoA) && (pesoB > pesoC) ) {
			System.out.println("La esfera de mayor peso es la esfera B");
		}
		if ( (pesoC > pesoB) && (pesoC > pesoA) ) {
			System.out.println("La esfera de mayor peso es la esfera C");
		}
		
	}

}
