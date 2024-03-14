package Parte_1;

import java.util.*;

public class ejc_10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite el número de inscripción del estudiante: ");
		int numIns = entrada.nextInt();
		System.out.println("Escriba los nombres del estudiante: ");
		String nombre = entrada.next();
		System.out.println("Digite el patrimonio del estudiante: ");
		double patrimonio = entrada.nextDouble();
		System.out.println("Digite el estrato del estudiante: ");
		double estrato = entrada.nextDouble();
				
		double matricula = 50000;
		
		if (patrimonio > 2000000 && estrato > 3 ) {
			matricula += patrimonio*(3/100) ;
			
		}
		
		System.out.println("Numero de inscripción: "+numIns);
		System.out.println("Nombres del estudiante: "+nombre);
		System.out.println("Valor a pagar por matricula: "+matricula);
		

	}

}
