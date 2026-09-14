import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua nota: ");
        double nota = sc.nextDouble();

        System.out.print("Digite sua nota: ");
        double nota2 = sc.nextDouble();

        System.out.print("Digite sua nota: ");
        double nota3 = sc.nextDouble();

        double media = (nota + nota2 + nota3) / 3;

        System.out.println("A média final é: " + media);

        sc.close();
    }
}