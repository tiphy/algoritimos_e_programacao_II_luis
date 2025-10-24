public class MeiaEntrada extends Ingresso {

    private String tipoDocumento; 


    public MeiaEntrada(String nomeEvento, float valor, String tipoDocumento) {

        super(nomeEvento, valor * 0.5f); 
        this.tipoDocumento = tipoDocumento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }


    @Override
    public void visualizar() {

        super.visualizar();

        System.out.println("Tipo Meia-Entrada: " + this.tipoDocumento);
    }
}