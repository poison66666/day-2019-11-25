public class AntiOrder {
    public int count(int[] A,int n){
        if(A == null || n == 0){
            return 0;
        }
        return mergeSort(A,0,n-1);
    }

    private int mergeSort(int[] a, int start, int end) {
        if(start == end){
            return 0;
        }
        int mid = (start + end)/2;
        //返回左边逆序对的数量+右边逆序对的数量+左右合并逆序对的数量
        return mergeSort(a,start,mid) + mergeSort(a,mid+1,end)+merge(a,start,mid,end);
    }

    private int merge(int[] a, int start, int mid, int end) {
        int i = start;
        int j = mid+1;
        int k = 0;
        int count = 0;
        int[] tmp = new int[end - start + 1];
        while (i <= mid && j <= end){
            //左右都排好序，如果a[i]>a[j],a[i]右边都大于a[j],所以使用mid-i+1
            if(a[i] <= a[j]){
                tmp[k++] = a[i++];
            }else{
                count += (mid - i + 1);
                tmp[k++] = a[j++];
            }
        }
        while (i <= mid){
            tmp[k++] = a[i++];
        }
        while (j <= end){
            tmp[k++] = a[j++];
        }
        for(int x = 0;x < tmp.length;x++){
            a[start+x] = tmp[x];
        }
        return count;
    }

    public static void main(String[] args) {
        AntiOrder a = new AntiOrder();
        int[] b = {1,2,3,4,5,6,7,0};
        int c = a.count(b,8);
        System.out.println(c);
    }
}
