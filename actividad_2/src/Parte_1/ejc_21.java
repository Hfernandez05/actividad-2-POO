package Parte_1;

import java.util.*;

public class ejc_21 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite el valor del lado 1: ");
		double lado1 = entrada.nextDouble();
		System.out.print("Digite el valor del lado 2: ");
		double lado2 = entrada.nextDouble();
		System.out.print("Digite el valor del lado 3: "); //solcitamos el valor de los 3 lados
		double lado3 = entrada.nextDouble();
		
		double perimetro = lado1 + lado2 + lado3;
		double semiP = perimetro/2;
		double area = Math.sqrt((semiP*(semiP-lado1)*(semiP-lado2)*(semiP-lado3))); //realizamos los
																					//calculos requeridos
		
		System.out.println("El perimetro del triangulo es: "+perimetro);
		System.out.println("el semiperimetro del triangulo es: "+semiP);
		System.out.println("La area el triangulo es: "+area);

	}

}
