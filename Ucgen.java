package Giris;

import java.util.Scanner;

public class Ucgen {
    public static void main(String[] args) {

        int a,b ;
        double c,u ;

        Scanner girdi = new Scanner(System.in);

        System.out.print("1. kenarı gir.");
        a = girdi.nextInt();

        System.out.print("2. kenarı gir.");
        b = girdi.nextInt();

        c = Math.sqrt( a*a + b*b);

        u = (a+b+c)/2 ;

        System.out.print("Hipotenüs "+c + "\nÜçgenin çevresi "+ 2*u+ "\nAlanı "+
                Math.sqrt(u*(u-a)*(u-b)*(u-c)));
    }
}
