import java.util.Scanner;

public class Ex_11 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("===== Calcúla a série de fibonacci até o 'n' termo =====");
        System.out.print("Digite o valor de n: ");
        int n = leitor.nextInt();

        int n1 = 1;
        int aux = 1;
        int ant = 0;

        for(int i = 0; i < n; i++){
            System.out.print(n1 + " ");
            n1 += ant;
            ant = aux;
            aux = n1;
        }

    }
    
}
