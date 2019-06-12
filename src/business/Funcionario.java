package business;

public class Funcionario extends Pessoa {
	private int IdFunc;
	private float salario;
	
	
	private int getIdFunc() {
		return IdFunc;
	}
	private void setIdFunc(int idFunc) {
		IdFunc = idFunc;
	}
	private float getSalario() {
		return salario;
	}
	private void setSalario(float salario) {
		this.salario = salario;
	}
	
	public Funcionario(String nome, String cpf, int idFunc, float salario) {
		super(nome, cpf);
		IdFunc = idFunc;
		this.salario = salario;
	}
	
	
	
	
}
