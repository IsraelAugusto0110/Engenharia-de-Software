package com.fatec.teste;

public class Carga implements Conta{
	private String tipoCobranca;
	private int tempoTotal, numEixos;
	private Double valorApagar, valorCarga, adicionalCarga = 0.05;
	
	
	public Carga(String tipoCobranca, int tempoTotal, int numEixos, Double valorCarga) {
		super();
		this.tipoCobranca = tipoCobranca;
		this.tempoTotal = tempoTotal;
		this.numEixos = numEixos;
		this.valorCarga = valorCarga;
	}

	@Override
	public Double calculaConta() {
		String tipoCobranca = this.getTipoCobranca().toUpperCase();
		int tempoTotal = this.getTempoTotal();
		//adicional de % da carga por eixo extra.
		Double adicionalCarga = (this.getValorCarga() * this.getAdicionalCarga()) * (this.getNumEixos() - 2);
		
		switch (tipoCobranca) {
		case "H":
			this.valorApagar = tempoTotal * Conta.valorHora;
			break;

		case "D":
			this.valorApagar = tempoTotal * Conta.valorDia;
			break;
			
		case "M":
			this.valorApagar = tempoTotal * Conta.valorMes;
			break;
			
		default:
			break;
		}
		
		this.valorApagar += adicionalCarga;
		
		return this.valorApagar;
	}



	public String getTipoCobranca() {
		return tipoCobranca;
	}

	public void setTipoCobranca(String tipoCobranca) {
		this.tipoCobranca = tipoCobranca;
	}

	public int getTempoTotal() {
		return tempoTotal;
	}

	public void setTempoTotal(int tempoTotal) {
		this.tempoTotal = tempoTotal;
	}

	public int getNumEixos() {
		return numEixos;
	}

	public void setNumEixos(int numEixos) {
		this.numEixos = numEixos;
	}

	public Double getValorCarga() {
		return valorCarga;
	}

	public void setValorCarga(Double valorCarga) {
		this.valorCarga = valorCarga;
	}

	public Double getAdicionalCarga() {
		return adicionalCarga;
	}

	public void setAdicionalCarga(Double adicionalCarga) {
		this.adicionalCarga = adicionalCarga;
	}

	public Double getValorApagar() {
		return valorApagar;
	}

	public void setValorApagar(Double valorApagar) {
		this.valorApagar = valorApagar;
	}
	
}
