package Java;

import java.util.Scanner;

public class ECommerceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n==Sistema E-Commerce: Demonstração de TAD Interativa==");
		
		Scanner leia = new Scanner(System.in);
		
		ProdutoFisico livro = new ProdutoFisico("Livro de Receitas Java Avançado",80.00,1.5);
		
		ProdutoDigital eCurso = new ProdutoDigital("Curso de Spring Boot e AWS",250.00,"https://download.spring.io/curso");
		
		livro.exibirDetalhes();
		
		eCurso.exibirDetalhes();
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionarItem(livro);
		carrinho.adicionarItem(eCurso);
		
		MetodoPagamento metodoEscolhido = null;
		
		System.out.println("\n-------------------------------------------------------");
		System.out.println("\nSelecione o Método de Pagamento:");
		System.out.println("\n1 - Cartão de Crédito");
		System.out.println("\n2 - Boleto Bancário");
		System.out.println("\nDigite 1 ou 2: ");
		int escolha = leia.nextInt();
		
		switch(escolha) {
		case 1:
			System.out.println("\nDigite os 4 últimos dígitos do cartão: ");
			String ultimosDigitos = leia.nextLine();
			metodoEscolhido  = new CartaoCredito("5555.xxxx.xxxx"+ultimosDigitos);
			break;
			
		case 2:
			metodoEscolhido = new Boleto();
			break;
			
			default:
				System.out.println("\nOpção inválida. Usando cartão de crédito como padrão.");
				metodoEscolhido = new CartaoCredito("0000.xxxx.xxxx.0000");
				break;
		}
		
		if(metodoEscolhido != null) {
			carrinho.checkout(metodoEscolhido);
			System.out.println("\nStatus final da Transação: "+metodoEscolhido.obterStatus());
			
		}else {
			System.out.println("\nNão foi possível iniciar o checkout");
		}
		leia.close();
	}

}
