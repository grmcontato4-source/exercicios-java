import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();

        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println("O antecessor e: " + antecessor);
        System.out.println("O sucessor e: " + sucessor);

        sc.close();
        }
    }
    

