import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o tempo em minutos: ");
        int minutos = leitor.nextInt();

        int horas = 0, dias = 0;

        while(minutos > 59){
            if(minutos - 60 > 0){
                horas += 1;
                minutos -= 60;
            }

            if(horas > 23){
                dias += 1;
                horas -= 24;
            }
        }

        System.out.println(dias + " Dias " + horas + " horas e " + minutos + " minutos");

    }
}
