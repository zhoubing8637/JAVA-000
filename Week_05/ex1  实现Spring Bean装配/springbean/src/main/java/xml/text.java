

@Test
public void text(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        People p1 =(People) context.getBean("people");
        p1.getCat().cry();
        p1.getDog().cry();
        }
