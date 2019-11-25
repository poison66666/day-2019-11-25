public class SynchronizedDemo {
    public synchronized void method() {
        // 具体代码
        for (int i = 0; i < 10; i++) {
            System.out.println("method" + Thread.currentThread().getName() + ": " + i);
        }
    }
    public synchronized void method1() {
        // 具体代码
        for (int i = 0; i < 10; i++) {
            System.out.println("method1" + Thread.currentThread().getName() + ": " + i);
        }
    }

    public synchronized static void staticMethod() {
        // 具体代码
    }

    public void block() {
        synchronized (this) {
            // 具体代码
        }
    }

    private static class MyThread extends Thread {
        @Override
        public void run() {
            while (true) {
                object.method();
            }
        }
        private SynchronizedDemo object;
        MyThread(SynchronizedDemo object) {
            this.object = new SynchronizedDemo();//不是同一个对象，每个对象有自己的一把锁，
            // 谁抢到CPU谁就执行，基本是交替执行，因为时间片的原因

            //this.object = object;  同一个对象，同一把锁，只能等一个方法把锁释放，另一个方法才能执行
        }
    }

    public static void main(String[] args) {
        SynchronizedDemo object = new SynchronizedDemo();
        Thread t = new MyThread(object);
        t.start();
        while (true) {
            object.method1();
        }
    }
}
