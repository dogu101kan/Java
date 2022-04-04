import java.util.Scanner;

public class Palindrom {
    static boolean isPalindrom(int x){
        int temp=x,reverseX=0,lastNum;
        while(temp!=0){
            lastNum = temp % 10;
            reverseX = (reverseX*10) +lastNum;
            temp/=10;
        }
        if (reverseX==x) {
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayi gir.");
        int x =input.nextInt();
        System.out.println(isPalindrom(x));
    }
}
