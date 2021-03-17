package com.fatec.teste;

public class Teste {

	public static void main(String[] args) {
		Double conta;
		
		//teste: passeio por hora
		Passeio passeioHora = new Passeio("H", 10);
		conta = passeioHora.calculaConta();
		System.out.println("Cliente: passeio horista.\nValor a pagar: R$" + conta);
		
		//teste: carga por hora
		Carga cargaHora = new Carga("H", 10, 4, 1000.00);
		conta = cargaHora.calculaConta();
		System.out.println("Cliente: carga horista.\nValor a pagar: R$" + conta);
		
		//teste: passageiros por hora
		Passageiros passageirosHora = new Passageiros("H", 10, 10);
		conta = passageirosHora.calculaConta();
		System.out.println("Cliente: passageiros horista.\nValor a pagar: R$" + conta);
	}
	
}
