package Parte_2;

public class Triangulo {
	int base;
	int altura;
	
	Triangulo(int base, int altura){
		this.base = base;
		this.altura = altura;
	}
	
	double calcularArea() {
		return (base*altura);
	}
	
	double calcularPerimetro() {
		return (base + altura + calcularHipotenusa());
	}
	
	double calcularHipotenusa() {
		return Math.pow(base*base + altura*altura, 0.5);
	}
	
	void determinarTipoTriángulo() {
		
		if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa())) {
		System.out.println("Es un triángulo equilátero"); 
		}
		else if ((base != altura) && (base != calcularHipotenusa()) &&
		(altura != calcularHipotenusa())) {
		System.out.println("Es un triángulo escaleno"); 
		}
		else {
		System.out.println("Es un triángulo isósceles"); 
		}
		}
}
