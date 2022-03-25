package Giris;

import java.util.Scanner;

public class KullaniciGiris {
    public static void main(String[] args) {
        String user,password,userpassword="java101";
        ;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınız.");
        user = input.nextLine();

        System.out.print("Şifreniz.");
        password = input.nextLine();
         if (user.equals("patika")&&password.equals(userpassword)){
             System.out.print("Giriş yapıldı.");
         } else {
             System.out.print("Giriş bilgileri yanlış sıfırlamak için 'y' tıkla.");
             String choose = input.nextLine();
             if (choose.equals("y")||choose.equals("Y")){

                 System.out.print("Yeni şifrenizi giriniz.");
                 password = input.nextLine();

                 if (password.equals(userpassword)){
                     System.out.print("Eski şifre olamaz.");
                 }else{
                     userpassword=password;
                 }

             }
         }
    }
}
