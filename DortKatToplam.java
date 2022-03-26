package Giris;

import java.util.Scanner;

public class CiftToplam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k,toplam=0 ;
        System.out.println("Dördün katlarını toplamak için sayı gir.Çıkmak için tek sayı gir.");
        while(true){
            k = input.nextInt();
            if (k%2!=0){
                System.out.println(toplam);
                break;
            }else if(k%4==0){
                toplam+=k;
            }else{
                continue;
            }
        }
    }
}
