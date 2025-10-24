public class Ingresso {

    private String nomeEvento;
    private float valor;


    public Ingresso(String nomeEvento, float valor) {
        this.nomeEvento = nomeEvento;
        this.valor = valor;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void visualizar() {
        System.out.println("---------------------------------");
        System.out.println("Evento: " + this.nomeEvento);
        System.out.printf("Valor: R$ %.2f\n", this.valor);
    }
}