1（选做）、自己写一个简单的 Hello.java，里面需要涉及基本类型，四则运行，if 和 for，然后自己分析一下对应的字节码，有问题群里讨论。
1：
cmd-->D:-->dir(查看文件)-->cd 文件名-->
javac -encoding UTF-8 Hello2.java(生成.class文件)-->
javap -c Hello2.class(查看字节码)

D:\work\IDEA\javaup\src\week_01>javap -c Hello2.class
Compiled from "Hello2.java"
public class week_01.Hello2 {
  public week_01.Hello2();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: bipush        10     //当int取值-128~127时，JVM采用bipush指令将常量10压入栈中。
       2: istore_1               //将10存储到局部变量表
       3: iconst_0              //当int取值-1~5时，JVM采用iconst指令将常量0压入栈中
       4: istore_2              //将0存储到局部变量表
       5: iload_2               //将0入栈
       6: bipush        10   //将10入栈
       8: if_icmpge     33  //如果一个int类型值大于或者等于另外一个int类型值，则跳转
      11: iload_2
      12: iconst_2
      13: irem                  //计算int类型除法的余数
      14: ifne          23
      17: iinc          1, 1    //把一个常量值加到一个int类型的局部变量上
      20: goto          27
      23: iload_1
      24: iconst_2
      25: imul
      26: istore_1
      27: iinc          2, 1
      30: goto          5
      33: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
      36: iload_1
      37: invokevirtual #3                  // Method java/io/PrintStream.println:(I)V
      40: return
}