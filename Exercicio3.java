import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite o Valor A: ");
        int a = sc.nextInt();

        System.out.print("Digite o Valor B: ");
        int b = sc.nextInt();

        int c;


        if (a == b) {
            c = a + b;
            
        }
        else {
            c = a * b;
        }
        System.out.println("O resultado de C é: " + c);

        sc.close();
    }
}
