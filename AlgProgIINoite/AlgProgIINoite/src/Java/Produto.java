package Java;

public abstract class Produto {

	private String nome;
	private double precoBase;
	protected double impostoPadrao = 0.10;//10% do imposto padrão
	
	//Construtor da classe abstrata
	public Produto(String nome,double precoBase) {
		this.nome = nome;
		this.precoBase = precoBase;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrecoBase() {
		return precoBase;
	}

	public void setPrecoBase(double precoBase) {
		this.precoBase = precoBase;
	}

	public double getImpostoPadrao() {
		return impostoPadrao;
	}

	public void setImpostoPadrao(double impostoPadrao) {
		this.impostoPadrao = impostoPadrao;
	}
	
	public abstract double calcularPrecoComImposto();
	
	public abstract double calcularCustoAdicional();
	
	public void exibirDetalhes() {
		System.out.println("\n-------Detalhes do Produto-------");
		System.out.println("\nNome: "+getNome());
		System.out.println("\nPreço Base: R$ "+String.format("%.2f",getPrecoBase()));
		System.out.println("\nImposto Aplicado: "+String.format("%.2f",impostoPadrao*100)+"%");
		System.out.println("\nTotal (c/ imposto): R$ "+String.format("%.2f",calcularPrecoComImposto()));
	}
	
}
