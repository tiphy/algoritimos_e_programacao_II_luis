public class CursoLivre extends Curso {
    private String patrocinador; 


    public CursoLivre(String nomeCurso, String area, float valorMensalidade, String patrocinador) {
        super(nomeCurso, area, valorMensalidade);
        this.patrocinador = patrocinador;
    }

    public String getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(String patrocinador) {
        this.patrocinador = patrocinador;
    }

    @Override
    public void visualizar() {
        super.visualizar();
 
        System.out.println("Patrocinador: " + this.patrocinador);
    }
}