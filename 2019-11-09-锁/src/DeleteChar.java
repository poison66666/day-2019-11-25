import java.util.Scanner;

public class DeleteChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = null;
        char[] str = null;
        while (sc.hasNext()) {
            x = sc.nextLine();
            str = sc.nextLine().toCharArray();
            for(int i = 0; i<str.length;i++){
                x = x.replace(str[i]+"","");
            }
            System.out.println(x);
        }
    }
}
