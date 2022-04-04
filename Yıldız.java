import java.util.Scanner;

public class Yıldız {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        a=input.nextInt();



        for (int i =0;i<=a;i++){
            for (int k=0;k<(a-i);k++){
                System.out.print(" ");
            }
            for (int j=1;j<=(2*i+1);j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i =a-1;i>=0;i--){
            for (int k=0;k<(a-i);k++){
                System.out.print(" ");
            }
            for (int j=1;j<=(2*i+1);j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
/*
  *
 ***
*****
*****

 */