import java.util.Scanner;

public class BuyukveKucukSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,buyuk,kucuk;

        System.out.println("Kaç sayı girilecek");
        a = input.nextInt();

        System.out.print("Sayı gir. ");
        b=input.nextInt();
        buyuk=b;
        kucuk=b;
        while(a>1){
            System.out.print("Sayı gir. ");
            b=input.nextInt();
            if(buyuk>b){
                if(b>=kucuk){
                    continue;
                }else{
                    kucuk = b;
                }
            }else{
                if(buyuk<kucuk){
                    kucuk=buyuk;
                }else{
                    buyuk=b;
                }
            }
            a--;
        }
        System.out.println("Buyuk "+buyuk+" Kucuk "+kucuk);

    }
}
