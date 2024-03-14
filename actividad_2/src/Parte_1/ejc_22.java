package Parte_1;

import java.util.Scanner;

public class ejc_22 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Escriba el nombre del empleado: ");
		String nombre = entrada.next();
		
		System.out.print("Digite el salario basico por hora del empleado: ");
		int salario = entrada.nextInt();
		
		System.out.print("Digite el numero de horas trabajdas al mes: ");
		int horas = entrada.nextInt();
		
		if ((salario*horas) > 450000) {
			System.out.println("el empleado se llama: "+nombre);
			System.out.println("Su salario mensual es: "+(horas*salario));
		}else {
			System.out.println("El empleado se llama: "+nombre);
		}
	}

}
