package dados;

import business.Quarto;
import interfaces.RepositorioQuarto;

public class DadosArray implements RepositorioQuarto {

	private Quarto[] quartos;
	private int indice;

	private final static int TAMANHO = 200;

	public DadosArray() {
		this.quartos = new Quarto[TAMANHO];
		this.indice = 0;
	}

	@Override
	public void criarQuarto(Quarto q) {
		// TODO Auto-generated method stub
		this.quartos[indice] = q;
		this.indice = this.indice + 1;

	}

	@Override
	public void removerQuarto(String numQuarto) {
		for (int i = 0; i < quartos.length; i++) {
			if (quartos[i].getNumQuarto() == numQuarto) {
				quartos[i] = null;

				for (int j = 0; j < quartos.length; j++) {
					if (quartos[j] == null && quartos[j + 1] != null) {
						quartos[i] = quartos[j + 1];
					}
				}
			}
		}

	}

	@Override
	public void atualizarStatus(Quarto q, boolean status) {
		q.setStatus(status);

	}

	@Override
	public Quarto procurar(String numQuarto) {
		Quarto a = new Quarto();
		for (int i = 0; i < quartos.length; i++) {
			if (quartos[i].getNumQuarto() == numQuarto) {
				a = quartos[i];

			} else {
				a = null;
			}
		}
		return a;
	}

	@Override
	public Quarto[] listar() {
		return quartos;
	}
	
	
	public String listarNumQuarto (int posicao) {
			return quartos[posicao].getNumQuarto();
	}

	@Override
	public String listarNumQuarto() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int tamanhoVetQuartos() {
		// TODO Auto-generated method stub
		return 0;
	}

}
