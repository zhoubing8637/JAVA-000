public class Method1 {//无锁方法
    private volatile Integer value = null;
    public static void main(String[] args) {
        long start=System.currentTimeMillis();//获得系统的时间，单位为毫秒
        // 在这里创建一个线程或线程池，
        // 异步执行 下面方法
        final Method1 method= new Method1();
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
    private  void sum(int num) {
        value =  fibo(num);
    }
    private static int fibo(int a) {
        if ( a < 2)
            return 1;
        return fibo(a-1) + fibo(a-2);
    }
    public int getValue(){
        while(value == null){
        }
        return value;
    }
}
