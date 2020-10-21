给秦老师的建议：
希望秦老师讲例子的时候有一个实际操作的演示，而不是对着一堆文字和自己的例子截图，干巴巴的讲
我不怕时间长，我只怕讲的不够细，谢谢秦老师！

学习笔记
作业：

2（必做）、自定义一个 Classloader，加载一个 Hello.xlass 文件，执行 hello 方法，此文件内容是一个 Hello.class 文件所有字节（x=255-x）处理后的文件。文件群里提供。
3（必做）、画一张图，展示 Xmx、Xms、Xmn、Meta、DirectMemory、Xss 这些内存参数的关系。
4（选做）、检查一下自己维护的业务系统的 JVM 参数配置，用 jstat 和 jstack、jmap 查看一下详情，并且自己独立分析一下大概情况，思考有没有不合理的地方，如何改进。


1：
cmd-->D:-->dir(查看文件)-->cd 文件名-->
javac -encoding UTF-8 Hello.java(生成.class文件)-->
javap -c Hello.class(查看字节码)