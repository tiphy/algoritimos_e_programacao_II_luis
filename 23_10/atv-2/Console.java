public class Console extends Produto {

    private String modelo; 


    public Console(int id, String nome, float preco, String modelo) {

        super(id, nome, preco);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void visualizar() {

        super.visualizar();

        System.out.println("Modelo: " + this.modelo);
    }
}