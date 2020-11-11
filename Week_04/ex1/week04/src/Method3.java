public class Method3 {//synchronized 方法
    private volatile Integer value = null;
    public static void main(String[] args) throws InterruptedException{
        long start=System.currentTimeMillis();//获得系统的时间，单位为毫秒
        // 在这里创建一个线程或线程池，
        // 异步执行 下面方法
        final Method3 method =  new Method3();
        Thread thread = new Thread(()->{
            method.sum(36);
        });
        thread.start();
        int result = method.getValue(); //这是得到的返回值
        // 确保  拿到result 并输出
        System.out.println("异步计算结果为："+result);
        System.out.println("使用时间："+ (System.currentTimeMillis()-start) + " ms");
        // 然后退出main线程
    }
    synchronized public void sum(int num) {
        value =  fibo(num);
        notify();
    }
    private static int fibo(int a) {
        if ( a < 2)
            return 1;
        return fibo(a-1) + fibo(a-2);
    }
    synchronized public int getValue() throws InterruptedException {
        while (value == null){
                wait();
        }
        return value;
    }
}
