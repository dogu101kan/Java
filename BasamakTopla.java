import java.util.Scanner;

public class BasamakTopla {
    public static void main(String[] args) {

        int sayi,temp,basamak=0,toplam=0;

        Scanner input = new Scanner(System.in);
        System.out.println("Sayı gir.");

        sayi = input.nextInt();
        temp=sayi;

        while(temp!=0){
            temp/=10;
            basamak++;
        }
        temp=sayi;
        for(int i =basamak;i>0;i--){
            temp= (int) (temp/Math.pow(10,i-1));
            toplam+=temp;
            temp= (int) (sayi%Math.pow(10, i-1));
        }
        System.out.println(toplam);


    }
}
