import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
             System.out.println("O Numero e Par: ");
        }
        else {
             System.out.println("O Numero e Impar: ");
        } 

        if (numero >= 0) {
            System.err.println("O Numero e Positivo");
        }
        else {
            System.err.println("O Numero e Negativo");

        }
            
            sc.close();
        }
    }

