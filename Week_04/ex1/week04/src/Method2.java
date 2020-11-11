import java.util.concurrent.atomic.AtomicInteger;

public class Method2 {//thread.join方法
    public static void main(String[] args) {
        long start=System.currentTimeMillis();//获得系统的时间，单位为毫秒
        // 在这里创建一个线程或线程池，
        // 异步执行 下面方法
        AtomicInteger value = new AtomicInteger();
        Thread thread = new Thread(()->{
            value.set(sum(36));
        });
        thread.start();
        try {
            thread.join();//thread.join的含义是当前线程需要等待previousThread线程终止之后才从thread.join返回。
                          // 即线程没有执行完之前，会一直阻塞在join方法处。
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int result = value.get(); //这是得到的返回值
        // 确保  拿到result 并输出
        System.out.println("异步计算结果为："+result);
        System.out.println("使用时间："+ (System.currentTimeMillis()-start) + " ms");
        // 然后退出main线程
    }
    private static int sum(int num) {
        return fibo(num);
    }
    private static int fibo(int a) {
        if ( a < 2)
            return 1;
        return fibo(a-1) + fibo(a-2);
    }
}
