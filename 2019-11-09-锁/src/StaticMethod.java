public class StaticMethod {
    public static synchronized void staticMethod(){
        for(int i = 0;i < 10;i++){
            System.out.println(Thread.currentThread() +" "+i);
        }
    }

    private static class MyThread extends Thread {
        @Override
        public void run() {
            while (true){
                StaticMethod.staticMethod();
            }
        }
    }

    public static void main(String[] args) {
        Thread t= new MyThread();
        t.start();
        while (true){
            StaticMethod.staticMethod();
        }
    }
}
