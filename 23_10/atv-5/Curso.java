public class Curso {

    private String nomeCurso;
    private String area; 
    private float valorMensalidade;

    public Curso(String nomeCurso, String area, float valorMensalidade) {
        this.nomeCurso = nomeCurso;
        this.area = area;
        this.valorMensalidade = valorMensalidade;
    }

 
    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public float getValorMensalidade() {
        return valorMensalidade;
    }

    public void setValorMensalidade(float valorMensalidade) {
        this.valorMensalidade = valorMensalidade;
    }

 
    public void visualizar() {
        System.out.println("---------------------------------");
        System.out.println("Curso: " + this.nomeCurso);
        System.out.println("Área: " + this.area);
        System.out.printf("Mensalidade: R$ %.2f\n", this.valorMensalidade);
    }
}