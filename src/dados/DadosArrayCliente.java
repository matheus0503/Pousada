package dados;

import business.Cliente;
import business.Quarto;
import interfaces.RepositorioCliente;


public class DadosArrayCliente implements RepositorioCliente{
		
	private Cliente[] clientes;
	private int indice;
	
	private final static int TAMANHO = 200;

	public DadosArrayCliente() {
		this.clientes = new Cliente[TAMANHO];
		this.indice = 0;
	
	}

	@Override
	public void criarCliente(Cliente c) {
		// TODO Auto-generated method stub
		this.clientes[indice] = c;
		this.indice = this.indice + 1;
	}

	@Override
	public void removerCliente(String cpf) {
		// TODO Auto-generated method stub
		for(int i = 0; i < clientes.length; i++) {
			if(clientes[i].getCpf() == cpf) {
				clientes[i]= null;
				
				for(int j = 0; j < clientes.length; j++) {
					if(clientes[j] == null && clientes[j + 1] != null) {
						clientes[i] = clientes[j + 1];
					}
				}
			}
		}
	}

	@Override
	public Cliente[] listar() {
		// TODO Auto-generated method stub
		return clientes;
	}

	@Override
	public String listaCpfCliente(String cpf) {
		// TODO Auto-generated method stub
		
		return null;
		}
	
	}
	


