import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.print("Digite o nome do aluno: ");
        String nome = sc.next();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println(nome + " Voce e maior de Idade ");
            
        }
        else {
            System.out.println(nome + " Voce e menor de Idade ");

        }
        sc.close();
    }
}