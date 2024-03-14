package Parte_1;

import java.util.*;
import java.math.*;

public class ejc_19 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digitie el valor del lado del triangulo: ");
		double lado = entrada.nextDouble(); //solicitamos valor del lado
		
		double perimetro = lado*3; // calculamos perimetro
		double altura =  (Math.sqrt(3)*lado)/2; //calculamos altura
		double area = (lado*altura)/2; // calculamos area
		
		System.out.println("El perimetro del triangulo es: "+perimetro);
		System.out.println("La altura del triangulo es: "+altura);
		System.out.println("La area del triangulo es: "+area);
		
		//imprimimos resultados
		
	}

}
