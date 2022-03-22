package Giris;

import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {

        double armut ,elma ,domates ,muz ,patlican;

        Scanner scanner = new Scanner((System.in));

        System.out.print("Armut kaç kilo?: ");
        armut = scanner.nextDouble();

        System.out.print("Elma kaç kilo?: ");
        elma = scanner.nextDouble();

        System.out.print("Domates kaç kilo?: ");
        domates = scanner.nextDouble();

        System.out.print("Muz kaç kilo?: ");
        muz = scanner.nextDouble();

        System.out.print("Patlıcan kaç kilo?: ");
        patlican = scanner.nextDouble();

        System.out.println("Toplam tutar: " + ((armut * 2.14) + (elma * 3.67) +
                (domates * 1.11) + (muz * 0.95) + (patlican * 5))+" Tl");


    }
}
