/**
 * 
 */
package business;

/**
 * @author pedro
 *
 */
public class Cliente  extends Pessoa{
	
	int IdCliente;

	/**
	 * @param nome
	 * @param cpf
	 * @param idCliente
	 */
	
	public Cliente(String nome, String cpf, int idCliente) {
		super(nome, cpf);
		IdCliente = idCliente;
	}

	public int getIdCliente() {
		return IdCliente;
	}

	public void setIdCliente(int idCliente) {
		IdCliente = idCliente;
	}
	
	
}
