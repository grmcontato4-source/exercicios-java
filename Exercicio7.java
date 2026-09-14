import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite true ou false: ");
        boolean valor1 = sc.nextBoolean();

        System.out.print("Digite true ou false: ");
        boolean valor2 = sc.nextBoolean();

        if (valor1 && valor2) {
            System.out.println("Ambos sao VERDADEIROS");
        } 
        else if (!valor1 && !valor2) { 
            
            System.out.println("Ambos sao FALSOS");
        } 
        else {
            System.out.println("Os valores sao mistos, um verdadeiro e um falso");
        }

        sc.close();

    }
}
