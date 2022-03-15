import java.util.Scanner;

public class Ex_18 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = leitor.nextInt();

        int eh_primo = primo(n, 1, 0);

        if(eh_primo == 1){
            System.out.println("É primo");
        }else{
            System.out.println("Não é primo");
        }
        
    }

    public static int primo(int n, int i, int j){
        if(n%i == 0){
            j += 1;
        }
        if(j > 2){
            return 0;
        }
        if (j == 2 && i == n){
            return 1;
        }

        return primo(n, i+1, j);
    }
}
