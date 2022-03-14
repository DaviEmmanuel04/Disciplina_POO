public class Ex_12{
    public static void main(String[] args) {
        int aux = 0;
        int soma = 0;
        int n = 9000;

        for(int i = 1; i < n; i++){
            int num[];
            num = new int[63];
            aux = 0;
            soma = 0;
            for(int j = i -1; j >= 1; j--){
                //System.out.println(j);
                if(i%j == 0){
                    num[aux] = j;
                    aux += 1;
                }
            }
            for(int k = 0; k <= num.length - 1; k++){
                soma += num[k];
            }
            if(soma == i){
                System.out.println(i);
            }
        }
    }
    
}
