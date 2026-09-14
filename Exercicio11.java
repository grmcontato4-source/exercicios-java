import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.print("Digite o nome do aluno: ");
        String nome = sc.next();
        
        System.out.print("Digite sua nota: ");
        double nota = sc.nextDouble();

        System.out.print("Digite sua nota: ");
        double nota2 = sc.nextDouble();

        System.out.print("Digite sua nota: ");
        double nota3 = sc.nextDouble();

        System.out.print("Digite sua nota: ");
        double nota4 = sc.nextDouble();

         double media = (nota + nota2 + nota3 + nota4) / 4;

        if (media >= 7) {
        System.out.println(nome + " foi APROVADO com média " + media);
        } else {
        System.out.println(nome + " foi REPROVADO.");
        }
        sc.close();
    }
}