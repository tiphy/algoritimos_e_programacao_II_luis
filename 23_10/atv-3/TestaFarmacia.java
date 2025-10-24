
public class TestaFarmacia {

    public static void main(String[] args) {


        Medicamento m1 = new Medicamento("Dipirona 500mg", 7891106909501L, 12.50f, "Sem receita");
        Medicamento m2 = new Medicamento("Amoxilina 250mg", 7896004706013L, 45.80f, "Receita comum");


        Perfumaria p1 = new Perfumaria("Shampoo Anticaspa", 7891000052302L, 29.99f, "Mentolado");
        Perfumaria p2 = new Perfumaria("Protetor Solar FPS 30", 7891010890015L, 65.00f, "Suave");


        System.out.println("========= DADOS DOS MEDICAMENTOS =========");
        m1.visualizar();
        m2.visualizar();

        System.out.println("\n========= DADOS DA PERFUMARIA =========");
        p1.visualizar();
        p2.visualizar();
    }
}