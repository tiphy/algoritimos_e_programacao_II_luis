public class Gerente extends Funcionario {
    private String setor;


    public Gerente(String nome, int matricula, float salario, String setor) {

        super(nome, matricula, salario);

        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public void visualizar() {

        super.visualizar();

        System.out.println("Setor: " + this.setor);
    }
}