package dados;

import business.Cliente;
import business.Estadia;
import interfaces.RepositorioEstadia;

public class DadosArrayEstadia implements  RepositorioEstadia {

	private Estadia[] estadia;
	private int indice;
	
	private final static int TAMANHO = 200;

	public DadosArrayEstadia() {
		this.estadia = new Estadia[TAMANHO];
		this.indice = 0;
	}
	
	@Override
	public void criarEstadia(Estadia e) {
		this.estadia[indice] = e;
		this.indice = indice + 1;
	}

	@Override
	public void removerEstatia(String cpf) {
		for(int i = 0; i < estadia.length; i++) {
			if(estadia[i].getCl().getCpf() == cpf ) {
				estadia[i] = null;
				
				for(int j = 0; j < estadia.length; j++) {
					if(estadia[j] == null && estadia[j + 1] != null) {
						estadia[j] = estadia[j + 1];
					}
				}
			}
		}
		
	}
	
}
