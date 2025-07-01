package Heranca;

public class Escola {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Ana", "123.456.789-00", "81 91234-5678");
        Professor professor1 = new Professor("Pedro", "234.567.890-11", "81 99876-5432");
        Funcionario funcionario1 = new Funcionario("Lucas", "345.678.901-22", "81 98765-4321");

        System.out.println("Aluno: " + aluno1.nome + ", CPF: " + aluno1.cpf + ", Tel: " + aluno1.telefone);
        System.out.println("Professor: " + professor1.nome + ", CPF: " + professor1.cpf + ", Tel: " + professor1.telefone);
        System.out.println("Funcionário: " + funcionario1.nome + ", CPF: " + funcionario1.cpf + ", Tel: " + funcionario1.telefone);
    }


	}

