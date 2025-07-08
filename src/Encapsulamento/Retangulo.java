package Encapsulamento;

public class Retangulo {
	private int base;
	private int altura;
	
	
	public void retangulo(int base, int altura) {
		this.base=base;
		this.altura=altura;
	}
	
	public int mostrarArea() {
		return base*altura;
	}
	public int mostrarPerimetro() {
		return 2*(base+altura);
	}
		
	}




