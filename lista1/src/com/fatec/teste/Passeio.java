package com.fatec.teste;

public class Passeio implements Conta{
	private String tipoCobranca;
	private int tempoTotal;
	private Double valorApagar;
	
	public Passeio(String tipoCobranca, int tempoTotal) {
		super();
		this.tipoCobranca = tipoCobranca;
		this.tempoTotal = tempoTotal;
	}

	@Override
	public Double calculaConta() {
		String tipoCobranca = this.getTipoCobranca().toUpperCase();
		int tempoTotal = this.getTempoTotal();
		
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

	public Double getValorApagar() {
		return valorApagar;
	}

	public void setValorApagar(Double valorApagar) {
		this.valorApagar = valorApagar;
	}
	
	
}
