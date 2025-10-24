public class TestaIngresso {

    public static void main(String[] args) {


        Vip vip1 = new Vip("Show de Rock", 300.00f, "Camarote A");
        Vip vip2 = new Vip("Festival de Jazz", 450.00f, "Pista Premium");


        MeiaEntrada meia1 = new MeiaEntrada("Peça de Teatro", 80.00f, "Estudante");
        MeiaEntrada meia2 = new MeiaEntrada("Exposição de Arte", 50.00f, "Idoso");

        System.out.println("========= INGRESSOS VIP =========");
        vip1.visualizar();
        vip2.visualizar();

        System.out.println("\n========= INGRESSOS MEIA-ENTRADA =========");
        meia1.visualizar();
        meia2.visualizar();
    }
}