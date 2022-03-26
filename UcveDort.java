package Giris;

import java.util.Scanner;

public class UcveDort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int toplam = 0,k,counter=0 ;
        System.out.println("Kaca kadar deger donecek");
        k = input.nextInt();

        for (int i =1 ;i<=k;i++){
            if (i%12==0){
                counter++;
                toplam+=i;
            }
        }
        System.out.println("Ortalaması "+toplam/counter);

    }
}
