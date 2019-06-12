package dados;

import business.Quarto;
import interfaces.RepositorioQuarto;

public class ControleQuarto {

	RepositorioQuarto quartos = new DadosArray();
	
	public void criarQuarto(Quarto q) {
		//regras de neggocio
			quartos.criarQuarto(q);
	}
	
	public void removerQuarto(int numQuarto) {
		quartos.removerQuarto(numQuarto);
	}
	
	public void atualizarStatus(Quarto q, boolean status) {
		
	}
	
	public int listarNumQuarto() {
		return quartos.listarNumQuarto();
	}
	

}
