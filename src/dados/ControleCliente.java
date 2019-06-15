package dados;

import business.Cliente;
import interfaces.RepositorioCliente;

public class ControleCliente {

	RepositorioCliente clientes = new DadosArrayCliente();
	
	public void criarCliente(Cliente c) {
		clientes.criarCliente(c);
	}
	
	public void removerCliente(String cpf) {
		clientes.removerCliente(cpf);
	}
	
}
