package Parte_2;

public class PruebaFiguras {

	public static void main(String[] args) {
		
		Circulo figura1 = new Circulo(2);
		Rectangulo figura2 = new Rectangulo(1,2);
		Cuadrado figura3 = new Cuadrado(3);
		Triangulo figura4 = new Triangulo(3,5);
		
		System.out.println("El área del círculo es = "+ figura1.calcularArea());
		System.out.println("El perímetro del círculo es = "+figura1.calcularPerimetro());
		System.out.println();
		
		System.out.println("El area del rectángulo es = "+figura2.calcularArea());
		System.out.println("El perímetro del rectángulo es = "+figura2.calcularPerimetro());
		System.out.println();
		
		System.out.println("El área del cuadrado es = "+figura3.calcularArea());
		System.out.println("El perímetro del cuadrado es = "+figura3.calcularPerimetro());
		System.out.println();
		
		System.out.println("El área del triángulo es = "+figura4.calcularArea());
		System.out.println("El perímetro del triángulo es = "+figura4.calcularPerimetro());
		figura4.determinarTipoTriángulo();
	}

}
