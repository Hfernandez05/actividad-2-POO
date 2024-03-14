package Parte_1;
import java.util.*;

public class ejc_18 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite el codigo del empleado: "); //solicitamos codigo empleado 
		int codigo = entrada.nextInt();
		
		System.out.print("Escriba el nombre del empleado: "); //solicitamos nombre empleado
		String nombre = entrada.next();
		
		System.out.print("Digite el número de horas trabajdas al mes: "); //solicitamos horas trabajdas al mes
		int horas = entrada.nextInt();
		
		System.out.print("Digite el valor de la hora trabajada: "); //solicitamos valor de cada hora
		int valor = entrada.nextInt();
		
		System.out.print("Digite el porcentaje de retencion en la fuente: "); //solicitamos la retencion en la fuente
		double ret = entrada.nextInt();
		
		double salario = horas*valor;  //calculamos salrio bruto 
		
		System.out.println("El codigo del empleado es: "+codigo);
		System.out.println("El nombre del empleado es: "+nombre);
		System.out.println("El salario bruto del empleado es: "+salario);
		
		double salneto = (salario) - ((ret/100)*salario);  //calculamos salario neto
		System.out.println("El salario neto de "+nombre+" es: "+salneto);
	
	}

}
