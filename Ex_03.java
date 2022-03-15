import java.math.RoundingMode;
import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o valor de um ângulo em graus: ");
        float angulo = leitor.nextFloat();
        double rad = Math.PI/180 * angulo;

        double seno = Math.sin(rad);
        double cosseno = Math.cos(rad);
        double tangente = Math.tan(rad);
        double cotangente = 1/tangente;
        double secante = 1/cosseno;
        double cossecante = 1/seno;

        System.out.println("=======================================================");
        System.out.println(angulo + " em radianos é: " + rad);
        System.out.println("O seno de " + angulo + " é: " + seno);
        System.out.println("O coseno de " + angulo + " é: " + cosseno);
        System.out.println("A tangente de " + angulo + " é: " + tangente);
        System.out.println("A cotangente de " + angulo + " é: " + cotangente);
        System.out.println("A secante de " + angulo + " é: " + secante);
        System.out.println("A cossecante de " + angulo + " é: " + cossecante);
        System.out.println("=======================================================");
    }
}
