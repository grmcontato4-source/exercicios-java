import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        int ano = sc.nextInt();
        int anoAtual = 2026;

        int anosVividos = (anoAtual - ano);
        int meses = (anosVividos * 12); 
        int dias = (anosVividos * 365);
        System.out.println("Você já viveu:");
        System.out.println(anosVividos + " anos,");
        System.out.println(meses + " meses e");
        System.out.println(dias + " dias.");

        sc.close();
    }
}
