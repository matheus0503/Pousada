package dados;

import business.Quarto;
import interfaces.RepositorioQuarto;

public class ControleQuarto {

	RepositorioQuarto quartos = new DadosArray();
	
	public void criarQuarto(Quarto q) {
		//regras de neggocio
			quartos.criarQuarto(q);
	}
	
	public void removerQuarto(String numQuarto) {
		quartos.removerQuarto(numQuarto);
	}
	
	public void atualizarStatus(Quarto q, boolean status) {
		
	}
	
	public String listarNumQuarto (int posicao) {
			return quartos.listarNumQuarto(posicao);
	}
	
	public Quarto[] listar() {
		return quartos.listar();
	}
	

}
