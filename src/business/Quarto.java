package business;

public class Quarto {

	private int numQuarto;
	private int capacidade;
	private boolean banheiro;
	private boolean status;
	
	public Quarto(int numQuarto, int capacidade, boolean banheiro, boolean status) {
		super();
		this.numQuarto = numQuarto;
		this.capacidade = capacidade;
		this.banheiro = banheiro;
	}
	


	public Quarto() {
		
	}

	public int getNumQuarto() {
		return numQuarto;
	}

	public void setNumQuarto(int numQuarto) {
		this.numQuarto = numQuarto;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public boolean getBanheiro() {
		return banheiro;
	}

	public void setBanheiro(boolean banheiro) {
		this.banheiro = banheiro;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	
}
