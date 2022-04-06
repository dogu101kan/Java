public class recursiveUs {
    static int us(int x,int y){
        int sonuc;

        if(y==0){
            return 1;
        }
        return sonuc =us(x,y-1)*x;
    }

    public static void main(String[] args) {
        System.out.println(us(2,3));
    }
}
//