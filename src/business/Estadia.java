package business;

import javax.xml.crypto.Data;

public class Estadia {

	int idEstadia;
	Data dataInicio, dataFim;
	Cliente cl;
	/**
	 * @param idEstadia
	 * @param dataInicio
	 * @param dataFim
	 * @param cl
	 */
	public Estadia(int idEstadia, Data dataInicio, Data dataFim, Cliente cl) {
		super();
		this.idEstadia = idEstadia;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.cl = cl;
	}
	
	public int getIdEstadia() {
		return idEstadia;
	}
	public void setIdEstadia(int idEstadia) {
		this.idEstadia = idEstadia;
	}
	public Data getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Data dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Data getDataFim() {
		return dataFim;
	}
	public void setDataFim(Data dataFim) {
		this.dataFim = dataFim;
	}
	public Cliente getCl() {
		return cl;
	}
	public void setCl(Cliente cl) {
		this.cl = cl;
	}
	
	
}
