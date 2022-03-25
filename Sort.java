package Giris;

import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);

        System.out.println("sayı 1 : ");
        a = input.nextInt();

        System.out.println("sayı 2 : ");
        b = input.nextInt();

        System.out.println("sayı 3 : ");
        c = input.nextInt();

        System.out.println(" a= " +a +"\n"+ " b= "+b+"\n"+" c= "+c );

        if (a > b && a > c) {
            if (b > c) {
                System.out.println("a>b>c");
            } else if (b < c) {
                System.out.println("a>c>b");
            } else {
                System.out.println("a>b=c");
            }

        } else if (b > a && b > c) {
            if (a > c) {
                System.out.println("b>a>c");
            } else if (a < c) {
                System.out.println("b>c>a");
            } else {
                System.out.println("b>a=c");
            }


        } else if (c > a && c > b) {
            if (b > a) {
                System.out.println("c>b>a");
            } else if (b < a) {
                System.out.println("c>a>b");
            } else {
                System.out.println("c>a=b");
            }

        }
        else if(a==b && a>c){
            System.out.println("a=b>c");
        }
        else if (b==c && b>a){
            System.out.println("b=c>a");
        }
        else if (a==c && a>b){
            System.out.println("a=c>b");
        }
        else{
            System.out.println("a=b=c");
        }


    }
}
