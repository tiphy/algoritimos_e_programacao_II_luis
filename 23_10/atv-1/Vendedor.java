public class Vendedor extends Funcionario {


    private float percentualComissao;


    public Vendedor(String nome, int matricula, float salario, float percentualComissao) {

        super(nome, matricula, salario);
        this.percentualComissao = percentualComissao;
    }

    public float getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(float percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    @Override
    public void visualizar() {

        super.visualizar();
        

        System.out.printf("Percentual Comissão: %.1f%%\n", this.percentualComissao);
    }
}