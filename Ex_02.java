import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.println("========== Calcula Média & Soma ==========");
        System.out.print("Digite o primeiro número: ");
        float n1 = leitor.nextFloat();
        System.out.print("Digite o segundo número: ");
        float n2 = leitor.nextFloat();
        System.out.print("Digite o terceiro número: ");
        float n3 = leitor.nextFloat();

        float soma = n1 + n2 + n3;
        float media = soma/3;

        System.out.println("A soma é: " + soma);
        System.out.println("A média é: " + media);
        System.out.println("==========================================");


    }
}
