package Java;

public class ProdutoDigital extends Produto{

	private String linkDownload;
	private double impostoReduzido = 0.05;
	
	public ProdutoDigital(String nome, double precoBase, String linkDownload) {
		super(nome,precoBase);
		this.linkDownload = linkDownload;
	}
	
	@Override
	public double calcularPrecoComImposto() {
		return getPrecoBase() * (1 + impostoReduzido);
	}
	
	@Override
	public double calcularCustoAdicional() {
		return 0.0;
	}
	
	public void iniciarDownload() {
		System.out.println("\nLink de Download Liberado: "+linkDownload);
		System.out.println("\nComeçando download...(Entrega imediata)");
	}
}
