import java.util.Scanner;

public class Ex_07 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.println("===== Escreve o nome da carta =====");
        System.out.println("1 - Ás | 11 - Dama | 12 - Valete | 13 - Rei");
        System.out.println("1 - Ouros | 2 - Paus | 3 - Copas | 4 - Espadas");
        System.out.print("Digite o número da carta: ");
        int num_carta = leitor.nextInt();
        System.out.print("Digte o número no nipe: ");
        int nipe = leitor.nextInt();

        String resultado = "";

        switch(num_carta) {
            case 1:
                resultado += "Ás de";
                break;
            case 2:
                resultado += "Dois de";
                break;
            case 3:
                resultado += "Três de";
                break;
            case 4:
                resultado += "Quatro de";
                break;
            case 5:
                resultado += "Cinco de";
                break;
            case 6:
                resultado += "Seis de";
                break;
            case 7:
                resultado += "Sete de";
                break;
            case 8:
                resultado += "Oito de";
                break;
            case 9:
                resultado += "Nove de";
                break;
            case 10:
                resultado += "Dez de";
                break;
            case 11:
                resultado += "Valete de";
                break;
            case 12:
                resultado += "Dama de";
                break;
            case 13:
                resultado += "Reis de";
                break;

        }

        switch(nipe){
            case 1:
                resultado += " ouros";
                break;
            case 2:
                resultado += " paus";
                break;
            case 3:
                resultado += " copas";
                break;
            case 4:
                resultado += " espadas";
                break;
        }

        System.out.println(resultado);
    }
}