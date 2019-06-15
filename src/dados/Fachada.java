package dados;

import business.Quarto;
import business.Cliente;
import business.Estadia;
import business.Funcionario;
import business.Pessoa;
import dados.DadosArrayFunc;
import dados.DadosArrayCliente;


public class Fachada {

	
	private ControleQuarto quartos;
	private ControleCliente clientes;
	private ControleEstadia estadia;
	private ControleFunc funcs;
	private static Fachada instance;
	
	public Fachada() {
		quartos = new ControleQuarto();
		clientes = new ControleCliente();
		estadia = new ControleEstadia();
	}
	
	public static Fachada getInstance(){
		if (Fachada.instance == null){
			Fachada.instance = new Fachada();
		}
		
		return Fachada.instance;	
}
	
	//métodos da classe Quarto
	public void criarQuarto(Quarto q) {
		quartos.criarQuarto(q);
	}
	
	public String listarNumQuartos(int posicao) {
		return quartos.listarNumQuarto(posicao);
	}
	
	public Quarto[] listar() {
		return quartos.listar();
	}
	
	//métodos da classe Funcionario
	public Funcionario procurarFunc (String cpfFunc) {
		return funcs.procurarFunc(cpfFunc);
	}
	
	
	//métodos da classe Clientte
	public void criarCliente(Cliente c) {
		clientes.criarCliente(c);
	}
	
	public void removerCliente(String cpf) {
		clientes.removerCliente(cpf);
	}
	
	//métodos da classe Estadia
	public void criarEstadia(Estadia e) {
		estadia.criarEstadia(e);
	}
	
	public void removerEstadia(String cpf) {
		estadia.removerEstadia(cpf);
	}
}