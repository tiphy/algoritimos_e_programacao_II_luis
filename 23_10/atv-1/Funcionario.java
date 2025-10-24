public class Funcionario {

    private String nome;
    private int matricula;
    private float salario;


    public Funcionario(String nome, int matricula, float salario) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void visualizar() {
        System.out.println("---------------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Matrícula: " + this.matricula);
        System.out.printf("Salário: R$ %.2f\n", this.salario);
    }
}