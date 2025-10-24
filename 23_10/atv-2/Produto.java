public class Produto {

    private int id;
    private String nome;
    private float preco;

    public Produto(int id, String nome, float preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }


    public void visualizar() {
        System.out.println("---------------------------------");
        System.out.println("ID do Produto: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.printf("Preço: R$ %.2f\n", this.preco);
    }
}