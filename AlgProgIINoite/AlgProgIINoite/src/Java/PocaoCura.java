package Java;

public class PocaoCura extends ItemMagico{
	
	//Atributo específico da subclasse
	private int pontosCura;
	
	//Construtor que vai chamar o construtor da super classe
	public PocaoCura(String nome, double peso, int pontosCura) {
		super(nome,peso);
		this.pontosCura = pontosCura;
	}
	
	@Override
	public void usar() {
		System.out.println("\n***Item: "+nome+" ***");
		System.out.println("A poção foi bebida...");
		System.out.println("Efeito: O herói recupera "+pontosCura+ " de vida!!!");
	}

	public int getPontosCura() {
		return pontosCura;
	}

	public void setPontosCura(int pontosCura) {
		this.pontosCura = pontosCura;
	}
	
	

}
