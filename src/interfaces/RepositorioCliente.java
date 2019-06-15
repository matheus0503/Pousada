package interfaces;

import business.Cliente;
import dados.DadosArrayCliente;

public interface RepositorioCliente {

	public void criarCliente(Cliente c);
	public void removerCliente(String cpf);
	public Cliente[] listar();
	public String listaCpfCliente(String cpf);
}
