package Parte_1;

import java.util.Scanner;
import java.math.*;

public class ejc_23 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite los valores de A, B y C respectivamente: ");
		
		double A = entrada.nextDouble();
		double B = entrada.nextDouble();
		double C = entrada.nextDouble();
		
		double discriminante =  ( (Math.pow(B, 2)) - ((4*A)*C) ) ;
		
		if ( discriminante  < 0){
			System.out.println("Discriminante negativo, no hay soluciones reales.");
		}
		if ( discriminante  == 0 ) {
			System.out.println("Discriminante igual a cero unica solucion: "+ ( ( (-1)*B )/( 2*A ) ) );
		}
		if ( discriminante  > 0){
			double sol1 = ( ((-1)*B) + Math.sqrt(discriminante) ) / (2*A);
			double sol2 = ( ((-1)*B) - Math.sqrt(discriminante) ) / (2*A);
			System.out.println("solucion 1: "+sol1 );
			System.out.println("solucion 2: "+sol2 );
		}
		
	}

}
