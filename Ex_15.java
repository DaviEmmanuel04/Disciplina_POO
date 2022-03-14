public class Ex_15 {
    public static void main(String[] args) {

        System.out.print(potencia(3, 4));
        
    }
    
    public static String potencia (int base, int expoente){
        String base_ex = "";
        if(expoente == 0){
            return(base_ex);
        } else if(expoente > 1){
            base_ex += base + "*";
        }else{
            base_ex += base;
        }
        return base_ex + potencia(base, expoente-1);
    }
}
