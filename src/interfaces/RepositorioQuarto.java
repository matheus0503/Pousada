package interfaces;

import business.Quarto;
import dados.DadosArray;

public interface RepositorioQuarto {

	public void criarQuarto(Quarto q);
	public void removerQuarto(int numQuarto);
	public void atualizarStatus(Quarto q, boolean status);
	public Quarto procurar(int numQuarto);
	public Quarto[] listar();
	public int listarNumQuarto();
}
