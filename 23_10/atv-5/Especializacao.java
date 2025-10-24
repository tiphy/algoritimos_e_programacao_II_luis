public class Especializacao extends Curso {

    private boolean reconhecidoMEC; 

    public Especializacao(String nomeCurso, String area, float valorMensalidade, boolean reconhecidoMEC) {
    
        super(nomeCurso, area, valorMensalidade);
        this.reconhecidoMEC = reconhecidoMEC;
    }


    public boolean isReconhecidoMEC() { 
        return reconhecidoMEC;
    }

    public void setReconhecidoMEC(boolean reconhecidoMEC) {
        this.reconhecidoMEC = reconhecidoMEC;
    }


    @Override
    public void visualizar() {

        super.visualizar();

        System.out.println("Reconhecido pelo MEC: " + (this.reconhecidoMEC ? "Sim" : "Não"));
    }
}