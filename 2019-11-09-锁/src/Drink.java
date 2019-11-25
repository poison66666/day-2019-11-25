import java.util.Scanner;

public class Drink {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while (sc.hasNext()){
            n = sc.nextInt();
            System.out.println(drink(n));
        }
    }

    private static int drink(int n) {
        int total = 0;
        while (n > 2){
            total = total + n/3; //换了几瓶
            n = n/3+n%3;//剩余瓶数
        }
        if(n == 2){
            total = total+1;
        }
        return total;
    }
}
