package Java;

public class Cajado extends ItemMagico{

	private int desgaste;

	//Criação do Construtor
	public Cajado(String nome, double peso, int desgaste) {
		super(nome, peso);
		this.desgaste = desgaste;
	}
	
	@Override
	public void usar() {
		System.out.println("---------Usando Cajado--------");
		System.out.println(getNome()+ " faz um feitiço poderoso com nível de Poder: "+getPeso()+".");
		this.desgaste++;//Simula o aumento do desgaste após o uso
		System.out.println("\nSeu desgaste agora é de: "+desgaste+".");
	}

	public int getDesgaste() {
		return desgaste;
	}

	public void setDesgaste(int desgaste) {
		this.desgaste = desgaste;
	}

	
	
	
	
}
