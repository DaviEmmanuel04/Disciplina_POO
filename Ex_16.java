import java.util.Scanner;

public class Ex_16 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num;
    
            System.out.print("Numero: ");
            num = sc.nextInt();
            
            System.out.println("Fatorial de " + num + " = " + fatorial(num, 0));
            
            sc.close();
        }
    
        public static long fatorial(int n, int num_t) {
            if (n==0) {
                return 1;
            } else {
                String tab = "";
                for(int i = 0; i < num_t; i++){
                    tab += "\t";
                }
                System.out.println(tab + "Valor de n: " + n);
                System.out.println(tab + "Valor chamada recurciva: " + n*(n-1));
                return n*fatorial(n-1, num_t+1);
            }
        }
    }
    

