package Java;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

	private List<Produto> itens = new ArrayList<>();
	
	public void adicionarItem(Produto produto) {
		this.itens.add(produto);
		System.out.println("\nAdicionando ao carrinho: "+produto.getNome());
	}
	
	public double calcularTotal() {
		double total=0;
		for (Produto item:itens) {
			total += item.calcularPrecoComImposto();
		}
		return total;
	}
	
	public double calcularCustoAdicionalTotal() {
		double custoTotal = 0;
		for (Produto item:itens) {
			custoTotal += item.calcularCustoAdicional();
		}
		return custoTotal;
	}
	
	public void checkout (MetodoPagamento pagamento) {
		double subTotal = calcularTotal();
		double custoAdicional = calcularCustoAdicionalTotal();
		double totalFinal = subTotal + custoAdicional;
		
		System.out.println("\n-----Resumo do checkout-----");
		System.out.println("\nSubTotal (Itens c/ imposto): R$ "+String.format("%.2f",subTotal));
		System.out.println("\nCusto adicional (Frete/Outros): R$ "+String.format("%.2f",custoAdicional));
		System.out.println("\nTotal final a pagar: R$ "+String.format("%.2f",totalFinal));
		
		boolean sucesso = pagamento.processarPagamento(totalFinal);
		
		if(sucesso) {
			System.out.println("\nTransação enviada para processamento. Status: "+pagamento.obterStatus());
			
			System.out.println("\n----Iniciando processo de entrega----");
			for(Produto item:itens) {
				if(item instanceof ProdutoFisico) {
					((ProdutoFisico) item).estimarEntrega();
				}else if(item instanceof ProdutoDigital) {
					((ProdutoDigital) item).iniciarDownload();
				}
			}
		}else {
			System.err.println("\n Erro no pagamento. por favor, tente outro método.");
		}
	}
}
