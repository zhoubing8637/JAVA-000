学习笔记


（必做）思考和设计自定义MQ第二个版本或第三个版本，
写代码实现其中至少一 个功能点，把设计思路和实现代码，提交到github。

第二个版本：自定义Queue 
2、去掉内存Queue，设计自定义Queue，实现消息确认和消费offset
 1）自定义内存Message数组模拟Queue。
 2）使用指针记录当前消息写入位置。
 3）对于每个命名消费者，用指针记录消费位置


第三个版本：基于SpringMVC实现MQServer
 3、拆分broker和client(包括producer和consumer) 
1）将Queue保存到web server端
2）设计消息读写API接口，确认接口，提交offset接口 
3）producer和consumer通过httpclient访问Queue
4）实现消息确认，offset提交 
5）实现consumer从offset增量