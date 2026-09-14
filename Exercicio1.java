import java.util.Scanner; 

public class Exercicios { 
    public static void main(String[] args) { 
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = sc.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = sc.nextInt();

        System.out.print("Digite o valor de C: ");
        int c = sc.nextInt();

        int soma = a + b;

        System.out.println("A soma e: " + soma);

        if (soma < c) {
            System.out.println("A soma e menor que C");
        } else {
            System.out.println("A soma nao e menor que C");
        }

        sc.close(); 
    } 
}