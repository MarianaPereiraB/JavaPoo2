package Encapsulamento;

public class TestePet {

	public static void main(String[] args) {
		Pet p1 = new Pet();
		
		p1.ajustarNome("");
		System.out.println(p1.mostrarNome());
	}

}
