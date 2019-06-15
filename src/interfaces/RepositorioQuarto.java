package interfaces;

import business.Quarto;
import dados.DadosArray;

public interface RepositorioQuarto {

	public void criarQuarto(Quarto q);
	public void removerQuarto(String numQuarto);
	public void atualizarStatus(Quarto q, boolean status);
	public Quarto procurar(String numQuarto);
	public Quarto[] listar();
	public String listarNumQuarto();
	public int tamanhoVetQuartos ();	
	public String listarNumQuarto (int posicao);
}
