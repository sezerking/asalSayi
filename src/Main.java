public class Main {
    public static void main(String[] args) {

        int toplamBolen=0;

        for (int i=2;i<=100;i++){
            for (int j=1;j<=i;++j){
                if (i%j==0){
                    toplamBolen++;
                }
            }
            if (toplamBolen<=2){
                    System.out.println(i+" bir asal sayidir");
            }
            toplamBolen=0;
        }

    }
}
