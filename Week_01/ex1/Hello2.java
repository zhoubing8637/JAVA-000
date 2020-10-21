package week_01;
//自己写一个简单的 Hello.java，里面需要涉及基本类型，四则运行，if 和 for，
// 然后自己分析一下对应的字节码
public class Hello2 {
    public static void main(String[] args) {
        int num =10;
        for(int i = 0;i<10;i++) {
            if (i % 2 == 0) {
                num++;
            } else {
                num *= 2;
            }
        }
        System.out.println(num);

    }
}
