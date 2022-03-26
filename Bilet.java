package Giris;

import java.util.Scanner;

public class Bilet {
    public static void main(String[] args) {
        int yas,km,yolculuk_t;
        double km_ucret =0.10 ,toplam_tutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Yaş gir. ");
        yas = input.nextInt();
        System.out.print("km gir. ");
        km = input.nextInt();
        System.out.print("Tek yön için 1\nGidiş dönüş için 2\n ");
        yolculuk_t = input.nextInt();

        if(yas<0 || km <0 || (yolculuk_t!=1&& yolculuk_t!=2)){
            System.out.print("hatalı giriş.");

        }else {

            toplam_tutar = km_ucret * km;

            if (yas < 12) {
                toplam_tutar /= 2;
            }
            if (yas >= 12 && yas < 25) {
                toplam_tutar -= toplam_tutar * 0.10;
            }
            if (yas > 65) {
                toplam_tutar -= toplam_tutar * 0.3;
            }
            if (yolculuk_t == 2) {
                toplam_tutar -= toplam_tutar * 0.2;
                toplam_tutar *= 2;
            }
            System.out.print("Toplam Tutar " + toplam_tutar);
        }

    }
}
