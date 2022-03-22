package Giris;

import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {

        double yaricap,alan,cevre,pi=3.14,merkezaci;

        Scanner input = new Scanner(System.in);

        System.out.print("Daire yarıçapını giriniz.");
        yaricap = input.nextDouble();
        System.out.print("Merkez açı ölçüsü gir.");
        merkezaci = input.nextDouble();

        alan = pi*yaricap*yaricap;
        cevre = 2*pi*yaricap;
        double merkezacialan = (pi*(yaricap*yaricap)*merkezaci)/360;

        System.out.print("Genel alan "+alan+"\nÇevre "+cevre+
                "\nDaire diliminin alanı "+merkezacialan);

    }
}
