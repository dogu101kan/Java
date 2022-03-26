package Giris;

import java.util.Scanner;

public class Kuvvetler {
    public static void main(String[] args) {
        //Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
        Scanner input = new Scanner(System.in);
        int k ;

        System.out.println("Kaça kadar gitsin");
        k = input.nextInt();
        System.out.println("5 için kuvvetler");
        for(int i = 1;i<=k;i*=5){
                System.out.print(i+",");
        }
        System.out.println("\n\n4 için kuvvetler");

        for(int i = 1;i<=k;i*=4){
                System.out.print(i+",");
        }

    }
}
