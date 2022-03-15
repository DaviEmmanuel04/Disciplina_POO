import java.util.Scanner;

public class Ex_05 {

    public static void main(String[] args) throws Exception {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = leitor.nextInt();

        int inv = 0;
        int res;

        while(num != 0){
            res = num%10;
            inv = inv * 10 + res;
            //System.out.print(inv);
            num = num/10;
        }

        System.out.print(inv);
    }
    
}
