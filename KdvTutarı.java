package Giris;
import java.util.Scanner;

public class KdvTutarı {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double kdv1 = 0.18 , kdv2 = 0.08 ;

        System.out.println("Ürün KDV siz fiyatını giriniz");
        double urun = input.nextDouble();

        boolean kosul = urun >=0 && urun <= 1000;
        double kdv =(kosul) ? kdv1 : kdv2 ;
        double kdvlifiyat = (urun * kdv) + urun;


        System.out.println(" KDV siz "+urun + "\n KDV "+kdv+"\n KDV li "+kdvlifiyat);


    }
}
