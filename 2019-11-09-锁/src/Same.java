import java.util.Scanner;

public class Same {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // while (sc.hasNext()){
            char[] a = sc.nextLine().toCharArray();
            String b = sc.nextLine();
            for(int i = 0;i < a.length;i++){
                if(!b.contains(String.valueOf(a[i]))) {
                    System.out.print(a[i]);
                }
            }
       // }
    }
}
