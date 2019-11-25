import java.util.Scanner;

public class Apple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //while (sc.hasNext()){
            int n = sc.nextInt();
            System.out.println(count(n));
       // }
    }
    private static int count(int n) {
        if(n % 2 != 0 || n == 10 || n < 6){
            return -1;
        }
        if(n % 8 == 0){
            return n/8;
        }
        return n/8+1;
    }

}
