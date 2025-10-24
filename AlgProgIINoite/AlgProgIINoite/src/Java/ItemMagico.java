package Java;

public abstract class ItemMagico {

	//Campos comuns a todos os itens
	protected String nome;
	protected double peso;
	
	//Método construtor
	public ItemMagico(String nome, double peso) {
		super();
		this.nome = nome;
		this.peso = peso;
	}
	
	//Método Concreto -- o mesmo comportamento para todos os itens
	public void exibirDetalhes() {
		System.out.println("-----Detalhes do Item-----");
		System.out.println("Nome: "+nome);
		System.out.println("Peso: "+peso+" kg");
	}
	
	//Método abstrato ESTE É O CORAÇÃO DO CONCEITO
	//ELE NÃO POSSUI IMPLEMENTAÇÃO
	public abstract void usar();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	
}
