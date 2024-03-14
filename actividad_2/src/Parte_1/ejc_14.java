package Parte_1;

import java.util.*;

public class ejc_14 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite la ventas del departamento 1: ");
		double ventas1 = entrada.nextDouble();

		System.out.println("Digite la ventas del departamento 2: ");
		double ventas2 = entrada.nextDouble();
		
		System.out.println("Digite la ventas del departamento 3: ");
		double ventas3 = entrada.nextDouble();
		
		System.out.println("Digite el salario de los vendedores ");
		double salario = entrada.nextDouble();
		
		double salario1 = salario;
		double salario2 = salario;
		double salario3 = salario;
		
		double total_ventas = ventas1+ventas2+ventas3;
		
		double porciento = total_ventas*0.33;
		
		if (ventas1 > porciento) {
			salario1 += salario*0.2;
		}
		if (ventas2 > porciento) {
			salario2 += salario*0.2;
		}
		if (ventas3 > porciento) {
			salario3 += salario*0.2;
		}
		
		System.out.println("El salario recibido por el departamento 1 es: "+salario1);
		System.out.println("El salario recibido por el departamento 2 es: "+salario2);
		System.out.println("El salario recibido por el departamento 3 es: "+salario3);
		
	}

}
