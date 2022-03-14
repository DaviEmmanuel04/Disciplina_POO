public class Ex_10 {
    public static void main(String[] args) {
        int num = 1;
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 10; j++){
                if(num<10){
                    System.out.print("[0" + num + "]");
                }else{
                    System.out.print("[" + num + "]");
                }
                num++;
            }
            System.out.print("\n");
        }
    }
}
