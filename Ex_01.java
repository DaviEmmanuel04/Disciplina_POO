import java.util.Scanner;
import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o comprimento do lado do quadrado: ");
        float lado = leitor.nextFloat();

        float area = lado * lado;

        System.out.println("A área do quadrado é: " + area);

    }
}
