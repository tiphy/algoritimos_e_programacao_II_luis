public class TestaFuncionario {
    public static void main(String[] args) {

        Gerente g1 = new Gerente("Ana Silva", 101, 15000.0f, "Tecnologia");
        Gerente g2 = new Gerente("Marcos Almeida", 102, 12000.0f, "Financeiro");


        Vendedor v1 = new Vendedor("Carlos Pereira", 201, 3500.0f, 5.0f);
        Vendedor v2 = new Vendedor("Juliana Costa", 202, 3800.0f, 5.5f);


        System.out.println("========= DADOS DOS GERENTES =========");
        g1.visualizar();
        g2.visualizar();


        System.out.println("\n========= DADOS DOS VENDEDORES =========");
        v1.visualizar();
        v2.visualizar();
    }
}