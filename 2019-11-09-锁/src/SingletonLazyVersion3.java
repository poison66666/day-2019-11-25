public class SingletonLazyVersion3 {
    private SingletonLazyVersion3() { }
    //保证代码的可重复性
    private volatile static SingletonLazyVersion3 instance = null;

    private static SingletonLazyVersion3 getInstance(){
        if(instance == null){
            synchronized (SingletonLazyVersion3.class){
                if(instance == null){
                    //分三步，所以要保证代码重复性
                    instance = new SingletonLazyVersion3();
                }
            }
        }
        return instance;
    }
}
