public class Ex_17 {

    public static void main(String[] args) {
        int m = 8, n = 2;

        System.out.println(mdc(m,n));

    }

    public static int mdc(int m, int n){
        if(n>m){
            return mdc(n, m);
        }
        if(n == 0){
            return m;
        }else{
            return mdc(n, m%n);
        }
    }
    
}
