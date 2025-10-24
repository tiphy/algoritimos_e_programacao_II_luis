package Java;

public class TesteItemMagico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("==============================================================================");
		System.out.println("Demonstração de polimorfismo com classe abstrata e TAD(Tipo Abstrato de Dados)");
		System.out.println("==============================================================================");
		
		PocaoCura pc = new PocaoCura("Poção da Velocidade",8,100);
		Cajado cajado = new Cajado("Cajado do Vento",45,1);
		
		ItemMagico [] inventario = new ItemMagico[2];
		
		inventario[0] = pc;
		inventario[1] = cajado;
		
		for(ItemMagico item:inventario) {
			System.out.println("Inventário contém: "+item.getNome());
			item.usar();
			System.out.println("-----------------------------------------");
		}
	}

}
