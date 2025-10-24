public class ProdutoFarmacia {


    private String nome;
    private long codigoBarras;
    private float preco;


    public ProdutoFarmacia(String nome, long codigoBarras, float preco) {
        this.nome = nome;
        this.codigoBarras = codigoBarras;
        this.preco = preco;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(long codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

  
    public void visualizar() {
        System.out.println("---------------------------------");
        System.out.println("Produto: " + this.nome);
        System.out.println("Código de Barras: " + this.codigoBarras);
        System.out.printf("Preço: R$ %.2f\n", this.preco);
    }
}