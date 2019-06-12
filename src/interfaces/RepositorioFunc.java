package interfaces;
import business.Funcionario;

public interface RepositorioFunc {

	public void criarFunc(Funcionario f);
	public void removerFunc(String cpfFunc);
	public Funcionario procurarFunc(String cpfFunc);
	public Funcionario[] listarFunc();
}
