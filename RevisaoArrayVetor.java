import java.util.Scanner;

public class RevisaoArrayVetor {

    public static void main(String[] args) {

        // TODO Auto-generated method stub

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nQuantos alunos tem na turma?");

        int numAlunos = scanner.nextInt();

        System.out.println("\nQuantas notas por aluno?");

        int numNotas = scanner.nextInt();

        String[] nomes = new String[numAlunos];

        double[][] notas = new double[numAlunos][numNotas];

        // Cadastrar alunos e notas

        for (int i = 0; i < numAlunos; i++) {

            scanner.nextLine();

            System.out.printf("\nNome do aluno %d: ", i + 1);

            nomes[i] = scanner.nextLine();

            for (int j = 0; j < numNotas; j++) {

                System.out.printf("\nNota %d do aluno %s: ", j + 1, nomes[i]);

                notas[i][j] = scanner.nextDouble();

            }

        }

        // Calcular e exibir as médias

        System.out.println("\nRelatório de notas: ");

        System.out.println("\n--------------------------------------- ");

        System.out.printf("%-20s %-10s %s\n ", "Aluno", "Média", "Situação");

        System.out.println("\n--------------------------------------- ");

        for (int i = 0; i < numAlunos; i++) {

            double soma = 0;

            for (int j = 0; j < numNotas; j++) {

                soma += notas[i][j];

            }

            double media = soma / numNotas;

            String situacao = (media >= 7) ? "Aprovado" : (media >= 5) ? "Exame" : "Reprovado";

            System.out.printf("%-20s %-10.2f %s\n", nomes[i], media, situacao);

        }

        scanner.close();

    }

}
