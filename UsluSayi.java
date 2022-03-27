package Giris;

import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        int a,b,toplam=1;
        Scanner input = new Scanner(System.in);
        System.out.println("taban ve üssü sırayla gir. ");
        a = input.nextInt();
        b = input.nextInt();
        if (b==0){
            System.out.println("0");
        }else {
            for (int i = 0; i < b; i++) {
                toplam *= a;
            }
        }
        System.out.println(toplam);
    }
}
