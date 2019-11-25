import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float A ,B ,C ;
        while (sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            A = (a+c)/2;
            B = (c-a)/2;
            C = (d-b)/2;
            if(A - ((a+c)/2)!=0){
                System.out.println("No");
                return;
            }
            if(B -((c-a)/2) !=0|| B != ((b+d)/2)){
                System.out.println("No");
                return;
            }
            if(C - ((d-b)/2)!=0){
                System.out.println("No");
                return;
            }
            System.out.println((int)A + " " +(int)B + " " +(int)C);
        }
    }
}