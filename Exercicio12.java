import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        double valor = sc.nextDouble();

        
        System.out.println("FORMAS DE PAGAMENTO:");
        System.out.println("1 - a Vista (Dinheiro ou Pix) - 15% de desconto");
        System.out.println("2 - a Vista (Cartao de Credito) - 10% de desconto");
        System.out.println("3 - Parcelado (2x) - Preço normal");
        System.out.println("4 - Parcelado (3x ou mais) - 10% de juros");
        
        System.out.print("Escolha a opcao: ");
        int opcao = sc.nextInt(); 

        double valorFinal;

        
        if (opcao == 1) {
            valorFinal = valor * 0.85; 
            System.out.println("Valor final: R$ " + valorFinal);
        } 
        else if (opcao == 2) {
            valorFinal = valor * 0.90; 
            System.out.println("Valor final: R$ " + valorFinal);
        }
        else if (opcao == 3) {
            valorFinal = valor;
            System.out.println("Valor final: R$ " + valorFinal);
        }
        else if (opcao == 4) {
            valorFinal = valor * 1.10; 
            System.out.println("Valor final: R$ " + valorFinal);
        }
        else {
            System.out.println("Opcao invalida");
        }

        sc.close();
    }
}