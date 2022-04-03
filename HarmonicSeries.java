import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;
        double toplam=0;

        n =input.nextInt();

        if(n!=0 || n<0){
            for(int i =1;i<=n;i++){
                toplam+=(1.0/i);
            }
            System.out.println("Toplam = "+toplam);
        }


    }
}
