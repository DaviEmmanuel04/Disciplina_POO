public class Ex_14 {
    public static void main(String[] args) {
        float populacaoA = 7000f;
        float populacaoB = 20000f;
        int anos = 0;

        while(populacaoA<=populacaoB){
            populacaoA += populacaoA * .035f;
            populacaoB += populacaoB * .01f;
            anos += 1;
        }

        System.out.println(anos);
    }
    
}
