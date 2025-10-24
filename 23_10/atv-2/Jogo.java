public class Jogo extends Produto {

    private String genero;

    public Jogo(int id, String nome, float preco, String genero) {

        super(id, nome, preco);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public void visualizar() {

        super.visualizar();

        System.out.println("Gênero: " + this.genero);
    }
}