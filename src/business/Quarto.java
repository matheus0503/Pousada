package business;

public class Quarto {

	private String numQuarto;
	private int capacidade;
	private boolean banheiro;
	private boolean status;
	
	public Quarto(String numQuarto, int capacidade, boolean banheiro, boolean status) {
		super();
		this.numQuarto = numQuarto;
		this.capacidade = capacidade;
		this.banheiro = banheiro;
	}
	


	public Quarto() {
		
	}

	public String getNumQuarto() {
		return numQuarto;
	}

	public void setNumQuarto(String numQuarto) {
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
