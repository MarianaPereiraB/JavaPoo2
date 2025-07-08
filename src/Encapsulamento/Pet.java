package Encapsulamento;

public class Pet {
	private String nome;
	private int idade;
	private String  tipo;
	private String raca;
	
	public void ajustarNome(String nome) {
		this.nome=nome;
			
	}
	public String mostrarNome() {
		return nome;
	
	}
	
	public void ajustarIdade(int idade) {
		this.idade=idade;
	}
	public int mostrarIdade() {
		return idade;
		
	}
	public void ajustarTipo(String tipo) {
		this.tipo=tipo;
	}
	public String mostrarTipo() {
		return tipo;
		
	}
	
	public void ajustarRaca(String raca) {
		this.raca=raca;
	}
	public String mostrarRaca() {
		return tipo;
	}

		
	
	}
		









