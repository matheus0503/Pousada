package dados;

import business.Estadia;
import interfaces.RepositorioEstadia;

public class ControleEstadia {

	RepositorioEstadia estadia = new DadosArrayEstadia();
	
	public void criarEstadia(Estadia e) {
		estadia.criarEstadia(e);
	}
	
	public void removerEstadia(String cpf) {
		estadia.removerEstatia(cpf);
	}
}
