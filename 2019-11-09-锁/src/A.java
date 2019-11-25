import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i <arr.length;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(differentn(arr,n,40,0));
        }

    }

    private static int differentn(int[] arr, int n, int i, int index) {
        if(i == 0){ //总容量
            return 1;
        }
        if(n == 0){ //不同物品的数目
            return 0;
        }else{
            //从最后一个开始装，如果无解，从倒数第二个开始重新装
            return differentn(arr,n-1,i-arr[index],index+1) +
                    differentn(arr,n-1,i,index+1);
        }
    }
}
