import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o X do primeiro ponto: ");
        int x1 = leitor.nextInt();
        System.out.print("Digite o Y do primeiro ponto: ");
        int y1 = leitor.nextInt();
        System.out.print("Digite o X do segundo ponto: ");
        int x2 = leitor.nextInt();
        System.out.print("Digite o Y do segundo ponto: ");
        int y2 = leitor.nextInt();

        if(x2 > x1){
            System.out.println("Esta a direita do primeiro ponto");
        } else if(x2 < x1){
            System.out.println("Esta a esquerda do primeiro ponto");
        } else{
            System.out.println("Os dois pontos estão alinhados horizontalmente");
        }

        if(y2 > y1){
            System.out.println("Esta acima do primeiro ponto");
        } else if(y2 < y1){
            System.out.println("Esta abaixo do primeiro ponto");
        }else{
            System.out.println("Os dois pontos estão alinhados verticalmente");
        }
    }
}
