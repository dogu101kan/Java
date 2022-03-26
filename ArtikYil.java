package Giris;

import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int yil;
        Scanner input = new Scanner(System.in);
        System.out.println("Yıl yaz");
        yil = input.nextInt();

        if ((yil%100==yil%400)){
            if(yil%4==0){
                System.out.println("Artik yil.");
            }else{
                System.out.println("Artik yil değil.");
            }
        }else{
            System.out.println("Artik yil değil.");
        }
    }
}

