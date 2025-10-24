package Java;

import java.util.Random;

public class Boleto implements MetodoPagamento{

	private String statusPagamento="Aguardando Pagamento";
	private final String codigoBarras;
	
	public Boleto() {
		this.codigoBarras = "00190.000009 01234.567890 1234.67890 2 987600000" + 
	(new Random().nextInt(100)+1);
	}
	
	@Override
	public boolean processarPagamento(double valor) {
	//Boleto é sempre "processado" (emitido), mas o status é "Pendente".
		this.statusPagamento="Boleto Emitido";
		System.out.println("\nBoleto de R$ "+valor+" gerado com sucesso.");
		System.out.println("\nCódigo de Barras: "+codigoBarras);
		return true;//A emissão é bem-sucedida
	}
	
	@Override
	public String obterStatus() {
		//Boleto tem um status que muda ao longo do tempo.
		return "Status do boleto: "+statusPagamento+". Confirmação leva até 3 dias úteis";
		
	}
}
