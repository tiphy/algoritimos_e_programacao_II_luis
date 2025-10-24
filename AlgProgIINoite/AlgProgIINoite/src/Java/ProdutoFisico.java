package Java;

public class ProdutoFisico extends Produto{

	private double pesoKg;
	private final double custoFrete = 15.00;
	
	public ProdutoFisico(String nome, double precoBase, double pesoKg) {
		super(nome,precoBase);
		this.pesoKg = pesoKg;
	}
	
	@Override
	public double calcularPrecoComImposto() {
		//Preço final = Preço Base + (PreçoBase + Imposto Padrão)
		return getPrecoBase() * (1 + impostoPadrao);
	}
	
	@Override
	public double calcularCustoAdicional() {
		return custoFrete + (pesoKg *2.0);
	}
	
	//Método próprio do ProdutoFisico
	public void estimarEntrega() {
		System.out.println("\nFrete Estimado: R$ "+String.format("%.2f",calcularCustoAdicional()));
		System.out.println("\nPrazo de entrega: de 5 a 7 dias úteis");
	}
}
