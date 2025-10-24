package Java;

import java.util.Random;

public class CartaoCredito implements MetodoPagamento{
	
	private String statusPagamento = "PENDENTE";
	private final String numeroCartao;
	
	public CartaoCredito(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	@Override
	public boolean processarPagamento(double valor) {
		if(new Random().nextDouble() <0.20) {
			this.statusPagamento = "Recusado pela Operadora";
			System.out.println("\nPagamento R$ "+valor+" recusado para o cartão "+numeroCartao.substring(0,4)+"...");
			return false;
		} else {
			this.statusPagamento="APROVADO";
			System.out.println("\nPagamento R$ "+valor+" aprovado com Cartão de Crédito...");
			return true;
		}
	}
	
	@Override
	public String obterStatus() {
		return "Status do Cartão: "+statusPagamento;
	}
}
