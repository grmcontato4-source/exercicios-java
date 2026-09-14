import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        double salariominimo = 1293.20;

        System.out.print("Digite o seu salario: ");
        double salarioUsuario = sc.nextDouble();

        double quantidadeSalarios = salarioUsuario / salariominimo;

        System.out.println("Você ganha o equivalente a " + quantidadeSalarios + " salários mínimos.");

        sc.close();
        
    }
}
