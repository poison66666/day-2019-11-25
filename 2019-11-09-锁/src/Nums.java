import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Nums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (sc.hasNext()){
            arrayList.add(sc.nextInt());
        }
        Collections.sort(arrayList);
        System.out.println(arrayList.get(arrayList.size()/2-1));
    }
}
