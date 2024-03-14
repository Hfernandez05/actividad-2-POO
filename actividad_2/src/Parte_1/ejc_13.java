package Parte_1;

import java.util.*;

public class ejc_13 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite el valor de su compra: ");
		double valor = entrada.nextDouble();
		
		System.out.print("Escriba el color de la bolita sacada: ");
		String color = entrada.next();
		
		double costo = 0;
		int descuento = 0;
		
		
		if (color.equals("BLANCO")) {
			costo = valor;
			descuento = 0;
		}
		if (color.equals("VERDE")) {
			costo = valor - (valor*0.1);
			descuento = 10;
		}
		if (color.equals("AMARILLA")) {
			costo = valor - (valor*0.25);
			descuento = 25;
		}
		if (color.equals("AZUL")) {
			costo = valor - (valor*0.5);
			descuento = 50;
		}
		if (color.equals("ROJO")) {
			costo = 0;
			descuento = 100;
		}
		
		System.out.println("El valor a pagar es "+costo+" con un descuento del "+descuento+"%");
	}

}
