# Engenharia-de-software
#DesignPatterns #POO

# Lista 01
## Problema: 
Calcular o valor a pagar pelos clientes de um estacionamento conforme lista I.pdf
Utilizar principios de engenharia de software para eleborar uma solução que atenta aos requisitos e que tenha flexibilidade para se adaptar a diferentes regras de negocio. 

### Pontos a destacar
Tipos de veiculo:

	Carro / Passeio - categoria A ( tambem inclui motos): cobrança normal
	
	Caminhão / carga - categoria B
		variavel quantidade de eixos: 2, 4, 6... etc: cobrar por eixo
		variavel valor da carga: ate R$10,000.00, R$10,000.00 - R$30,000.00, R$30,000.00+: cobrar uma porcentagem do valor da carga
		
	Onibus / Passageiros - categoria C
		variavel quantidade de passageiros: ate 10, 10-20, 20+: somar 10% 20% ou 30% ao total

Tipos de cobrança:

	hora valor
	
	diaria
	
	mensal
 
 Esta é uma possivel implementação em codigo java
 ### interface Hora
 public interface Hora {
	static Double valorHora = 6.00;
	
	public Double calculaConta();
}

### classe passeio horista
public class PasseioHorista implements Hora{
	
	private Double valorhora = Hora.valorHora;
	private int qtdHoras;

	@Override
	public Double calculaConta() {
		int tempo = this.getQtdHoras();
		return tempo * valorHora;
	}

	public int getQtdHoras() {
		return qtdHoras;
	}

	public void setQtdHoras(int qtdHoras) {
		this.qtdHoras = qtdHoras;
	}
	
	
}

### teste
public class Teste {

	public static void main(String[] args) {
		PasseioHorista horista = new PasseioHorista();
		horista.setQtdHoras(6);
		
		Double conta = horista.calculaConta();
		
		System.out.println("Valor a pagar R$ " + conta);

	}

}

