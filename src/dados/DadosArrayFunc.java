package dados;

import business.Funcionario;
import interfaces.RepositorioFunc;

public class DadosArrayFunc implements RepositorioFunc {

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	private Funcionario[] funcs;
	private int indice;

	private final static int TAMANHO = 200;
	
	public DadosArrayFunc() {
		this.funcs = new Funcionario[TAMANHO];
		this.indice = 0;
	}

	@Override
	public void criarFunc(Funcionario f) {
		// TODO Auto-generated method stub
		this.funcs[indice] = f;
		this.indice = this.indice + 1;

	}

	@Override
	public void removerFunc(String cpfFunc) {
		for (int i = 0; i < funcs.length; i++) {
			if (funcs[i].getCpf() == cpfFunc) {
				funcs[i] = null;

				for (int j = 0; j < funcs.length; j++) {
					if (funcs[j] == null && funcs[j + 1] != null) {
						funcs[i] = funcs[j + 1];
					}
				}
			}
		}

	}

	@Override
	public Funcionario procurarFunc(String cpfFunc) {
		for (int i = 0; i < funcs.length; i++) {
			if (funcs[i].getCpf() == cpfFunc) {
				return funcs[i];
			}
		}
		
		return null;
	}

	@Override
	public Funcionario[] listarFunc() {
		
		return funcs;
	}

}
