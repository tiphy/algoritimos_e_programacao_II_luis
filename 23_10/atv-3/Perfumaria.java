public class Perfumaria extends ProdutoFarmacia {

    private String fragrancia;

    public Perfumaria(String nome, long codigoBarras, float preco, String fragrancia) {

        super(nome, codigoBarras, preco);
        this.fragrancia = fragrancia;
    }

    public String getFragrancia() {
        return fragrancia;
    }

    public void setFragrancia(String fragrancia) {
        this.fragrancia = fragrancia;
    }

    @Override
    public void visualizar() {

        super.visualizar();

        System.out.println("Fragrância: " + this.fragrancia);
    }
}