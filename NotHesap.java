package Giris;
import java.util.Scanner;

public class NotHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat,fizik,kimya,turkce, müzik;


        System.out.println("Matematik notun ?");
        mat = input.nextInt();

        System.out.println("Fizik notun ?");
        fizik = input.nextInt();

        System.out.println("kimya notun ?");
        kimya = input.nextInt();

        System.out.println("turkce notun ?");
        turkce = input.nextInt();

        System.out.println("Müzik notun ?");
        müzik = input.nextInt();

        int toplam = mat+fizik+kimya+turkce+müzik ;

        float sonuc =toplam/5;

        System.out.println(sonuc);

        String str = (sonuc<60)? "Sınıfta kaldın.":"Sınıfı geçtin.";
        System.out.println(str);
    }
}
