package com.fatec.teste;

public class Passageiros implements Conta{
	private String tipoCobranca;
	private int tempoTotal, numPassageiros;
	private Double valorApagar;
	
	
	
	public Passageiros(String tipoCobranca, int tempoTotal, int numPassageiros) {
		super();
		this.tipoCobranca = tipoCobranca;
		this.tempoTotal = tempoTotal;
		this.numPassageiros = numPassageiros;//multiplos de 5
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
		// o valor aumenta a cada 5 passageiros
		this.valorApagar = this.valorApagar * (this.numPassageiros / 5);
		
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



	public int getNumPassageiros() {
		return numPassageiros;
	}



	public void setNumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}



	public Double getValorApagar() {
		return valorApagar;
	}



	public void setValorApagar(Double valorApagar) {
		this.valorApagar = valorApagar;
	}
	
	
}
