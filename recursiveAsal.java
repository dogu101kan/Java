public class recursiveAsal {
    static boolean asal(int x,int i ){

        if(i*i>x||x==2){
            System.out.println("Asaldır.");
            return true;
        }

        if(x<2 || x%i==0){
            System.out.println("Asal değil.");
            return false;
        }

        return asal(x,i+1);

    }

    public static void main(String[] args) {
        asal(7,2);
    }
}
