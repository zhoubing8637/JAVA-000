import java.util.concurrent.*;

public class Method8 implements Callable<Integer> {//future
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        long start=System.currentTimeMillis();//获得系统的时间，单位为毫秒
        // 在这里创建一个线程或线程池，
        // 异步执行 下面方法
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<Integer> future = executor.submit(new Method8());

        int result = future.get(); //这是得到的返回值
        // 确保  拿到result 并输出
        System.out.println("异步计算结果为："+result);
        System.out.println("使用时间："+ (System.currentTimeMillis()-start) + " ms");
        // 然后退出main线程
    }
    private  int sum(int num) {
        return fibo(num);
    }
    private  int fibo(int a) {
        if ( a < 2)
            return 1;
        return fibo(a-1) + fibo(a-2);
    }
    @Override
    public Integer call() throws Exception{
        return sum(36);
    }
}
