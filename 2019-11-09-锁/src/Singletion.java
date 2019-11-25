public class Singletion {
    //单例模式（饿汉）直接new对象

    //不允许外边调用构造方法
    private Singletion(){}
    //线程安全
    private static final Singletion instance = new Singletion();
    public static Singletion getInstance(){
        return instance;
    }
}
