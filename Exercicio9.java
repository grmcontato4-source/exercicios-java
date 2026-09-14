import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu peso: ");
        double peso = sc.nextDouble();

        System.out.print("Digite a sua altura: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        if (imc <= 18.5) {
            System.out.println("Esta abaixo do peso");
        } 
        else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Peso ideal");
        }
        else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } 
        else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Obesidade Grau I");
        } 
        else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Obesidade Grau II");
        } 
        else {
            System.out.println("Obesidade Grau III");
        }

        sc.close();
    }
}