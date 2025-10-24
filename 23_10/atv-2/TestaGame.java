public class TestaGame {
    public static void main(String[] args) {


        Jogo j1 = new Jogo(101, "Elden Ring", 249.90f, "RPG de Ação");
        Jogo j2 = new Jogo(102, "Stardew Valley", 29.99f, "Simulação");

  
        Console c1 = new Console(201, "Playstation 5", 4499.00f, "Slim Digital");
        Console c2 = new Console(202, "Xbox Series S", 2199.00f, "1TB Carbon Black");

        System.out.println("========= DADOS DOS JOGOS =========");
        j1.visualizar(); 
        j2.visualizar(); 

    
        System.out.println("\n========= DADOS DOS CONSOLES =========");
        c1.visualizar(); 
        c2.visualizar(); 
    }
}