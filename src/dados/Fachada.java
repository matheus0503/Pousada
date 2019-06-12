package dados;

import business.Quarto;
import business.Funcionario;
import business.Pessoa;
import dados.DadosArrayFunc;


public class Fachada {

	
	private ControleQuarto quartos;
	private ControleFunc funcs;
	private static Fachada instance;
	
	public Fachada() {
		quartos = new ControleQuarto();
	}
	
	public static Fachada getInstance(){
		if (Fachada.instance == null){
			Fachada.instance = new Fachada();
		}
		
		return Fachada.instance;
		
		
}
	
	
	public void criarQuarto(Quarto q) {
		quartos.criarQuarto(q);
	}
	
	public void listarNumQuartos() {
		quartos.listarNumQuarto();
	}
	
	
}