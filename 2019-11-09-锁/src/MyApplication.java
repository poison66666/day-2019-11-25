class Text {
    public static void hello() { //静态方法，与对象无关

        System.out.println("hello");
    }
}
public class MyApplication {
    public static void main(String[] args) {
// TODO Auto-generated method stub
        Text test=null;
        test.hello(); Text.hello();
    }
}
