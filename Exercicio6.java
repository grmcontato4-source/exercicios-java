import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o Valor: ");
        double valor = sc.nextDouble();

         double valorfinal = valor * 1.05;

        System.out.println("O valor com reajuste de 5% é: " + valorfinal);

        sc.close();

    }
}
