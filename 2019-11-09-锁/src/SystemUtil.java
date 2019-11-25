public class SystemUtil{
    public static boolean isAdmin(String userId){
        return userId.toLowerCase()=="admin"; //字符串判断不可以用==判断，要用equals判断
    }
    public static void main(String[] args){
        System.out.println(isAdmin("Admin"));
    }
}
