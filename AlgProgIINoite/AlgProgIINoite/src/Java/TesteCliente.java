package Java;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Testes dos objetos usando a classe Cliente
		Cliente c1 = new Cliente("Carlos Henrique",18,"Tech Lead",7500.0f,"carlos@henrique.com.br");
		Cliente c2 = new Cliente("Pedro Wallas",18,"Scrum Master",10500.0f,"pedro@wallas.com.br");
		
		c1.visualizar();
		c2.visualizar();
		
		//Testes usando a classe PessoaFisica
		PessoaFisica pf1 = new PessoaFisica("Douglas Carvalho",27,"Vice-Presidente do Grupo IBM",50000.0f,"douglas@carvalho.com.br","345678912-09","2567895-4");
		pf1.visualizar();
		
		//Testes usando a classe PessoaJuridica
				PessoaJuridica pj1 = new PessoaJuridica("Everton Ribeiro",33,"IBM",60000.0f,"everton@ribeiro.com.br","345678912/0001");
				pj1.visualizar();
				pf1.visualizar();
	}

}
