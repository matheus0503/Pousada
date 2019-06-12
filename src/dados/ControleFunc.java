package dados;

import business.Funcionario;
import interfaces.RepositorioFunc;

public class ControleFunc {

	RepositorioFunc funcs = (RepositorioFunc) new DadosArray();
	
	public void criarFunc(Funcionario f) {
		//regras de neggocio
		funcs.criarFunc(f);
	}
	
	public void removerFunc(String cpfFunc) {
		funcs.removerFunc(cpfFunc);
	}
	
	public Funcionario procurarFunc (String cpfFunc) {
		return funcs.procurarFunc(cpfFunc);
	}
	

}
