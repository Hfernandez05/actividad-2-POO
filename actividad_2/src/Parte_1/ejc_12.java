package Parte_1;

import java.util.*;

public class ejc_12 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escriba el nombre del empleado");
		String nombre = entrada.next();
		System.out.println("Digite la cantidad de horas trabajadas: ");
		int horas = entrada.nextInt();
		System.out.println("Digite el valor de cada hora: ");
		int valor = entrada.nextInt();
		
		int pago;
		if(horas > 40) {
			int extra = horas - 40;
			if(extra > 8) {		
				int extraTriple = extra - 8;
				pago = (40*valor)+(2*8*valor)+(extraTriple*3*valor);
			}else {
				pago = (40*valor)+(extra*2);
				}
		}else {
			pago = horas*valor;
		}
		
		System.out.println("El trabajador "+nombre+" devengó: "+pago);
		
	}

}
