 package Java;

public interface MetodoPagamento {

	boolean processarPagamento(double valor);
	
	String obterStatus();
}
