public class Ex_13 {

    public static void main(String[] args) {
        for(int i = 100; i <= 999; i++){
            int centena = (i/100);
            int dezena = ((i - centena*100)/10);
            int unidade = i - (dezena*10 + centena*100);
            double c1 = Math.pow(centena, 3);
            double c2 = Math.pow(dezena, 3);
            double c3 = Math.pow(unidade, 3);
            if((c1 + c2 + c3) == i ){
                System.out.println(i);
            }
        }
    }
    
}
