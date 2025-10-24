public class TestaCurso {
    public static void main(String[] args) {

        CursoLivre cl1 = new CursoLivre("Java Básico", "Tecnologia", 0.0f, "Empresa X");
        CursoLivre cl2 = new CursoLivre("Inglês Instrumental", "Idiomas", 150.0f, "Escola Y");

        Especializacao esp1 = new Especializacao("Pós-graduação em IA", "Tecnologia", 799.90f, true);
        Especializacao esp2 = new Especializacao("MBA em Gestão", "Negócios", 1200.00f, false);

        System.out.println("========= CURSOS LIVRES =========");
        cl1.visualizar();
        cl2.visualizar();

        System.out.println("\n========= ESPECIALIZAÇÕES =========");
        esp1.visualizar();
        esp2.visualizar();
    }
}