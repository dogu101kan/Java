package Giris;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {

        int a,b,select;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı gir. ");
        a = input.nextInt();

        System.out.print("İkinci sayıyı gir. ");
        b = input.nextInt();

        System.out.print("1.Toplama\n2.Çıkartma\n3.Çarpma\n4.Bölme");
        select = input.nextInt();

        switch(select){
            case 1:
                System.out.print(a+b);
                break;

            case 2:
                System.out.print(a-b);
                break;

            case 3:
                System.out.print(a*b);
                break;

            case 4:
                System.out.print(a/b);
                break;

            default:
                System.out.print("Geçersiz işlem");
                break;
        }

    }
}
