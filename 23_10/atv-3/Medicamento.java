public class Medicamento extends ProdutoFarmacia {


    private String tipoReceita; 


    public Medicamento(String nome, long codigoBarras, float preco, String tipoReceita) {
     
        super(nome, codigoBarras, preco);
        this.tipoReceita = tipoReceita;
    }


    public String getTipoReceita() {
        return tipoReceita;
    }

    public void setTipoReceita(String tipoReceita) {
        this.tipoReceita = tipoReceita;
    }

    @Override
    public void visualizar() {
 
        super.visualizar();

        System.out.println("Tipo de Receita: " + this.tipoReceita);
    }
}