import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Ex_04 {
    public static void main(String[] args) throws Exception {

        Scanner leitor = new Scanner(System.in);

        System.out.println("============ Converte para Fahrenheit ============");
        System.out.print("Digite a temperatura em graus centígrados: ");
        float temp = leitor.nextFloat();
        
        float new_temp = (temp * 9/5) + 32;
        
        System.out.println(temp + " °C em Fahrenheit: " + new_temp + " °F");
        System.out.println("==================================================");
    }
}
