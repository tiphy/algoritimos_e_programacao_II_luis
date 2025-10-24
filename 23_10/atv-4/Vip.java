public class Vip extends Ingresso {
    private String localizacao; 

    public Vip(String nomeEvento, float valor, String localizacao) {

        super(nomeEvento, valor);
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }


    @Override
    public void visualizar() {
        super.visualizar();

        System.out.println("Localização VIP: " + this.localizacao);
    }
}