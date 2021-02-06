毕业项目
分别用100个字以上的一段话，加上一副图，总结自己对下列技术的关键点的思考和经验认识：
4)Spring和ORM等框架
（1）Spring为JavaEE开发提供了一个轻量级的解决方案，可以说Spring是贯穿表现层、业务层、持久层，为javaEE提供一站式解决方案的框架。主要表现为：
IOC（或者叫做DI）的核心机制，提供了bean工厂（Spring容器），降低了业务对象替换的复杂性，提高了组件之间的解耦。
AOP的将一些通用任务，如安全、事务、日志等集中进行管理，提高了复用性和管理的便捷性。
ORM和DAO提供了与第三方持久层框架的良好整合，简化了底层数据访问。
提供了优秀的Web MVC框架。
基于Spring框架的应用，可以独立于各种应用服务器，实现 write once, run anywhere,
Spring可以与第三方框架良好整合（如ORM,DAO等模块与其他框架整合），但同时Spring提供了高度开放性，应用不会被强制依赖Spring，开发者可以自由选择Spring的部分或者全部。
（2）Spring框架是分模块存在，除了最核心的Spring Core Container(即Spring容器)是必要模块之外，其他模块都是可选，视需要而定。
官方文档Spring4.0的架构图中，包含了20多个子模块，大致可以分为四类：核心容器（Core Container）、数据访问和集成（Data Access/Integration）、Web、AOP。
本质上Spring可以总结为以下七个模块。
核心容器：核心容器提供 Spring 框架的基本功能。核心容器的主要组件是 BeanFactory，它是工厂模式的实现。BeanFactory 使用控制反转 （IOC） 模式将应用程序的配置和依赖性规范与实际的应用程序代码分开。
Spring 上下文：Spring 上下文是一个配置文件，向 Spring 框架提供上下文信息。Spring 上下文包括企业服务，例如 JNDI、EJB、电子邮件、国际化、校验和调度功能。
Spring AOP：通过配置管理特性，Spring AOP 模块直接将面向切面的编程功能集成到了 Spring 框架中。可以将一些通用任务，如安全、事务、日志等集中进行管理，提高了复用性和管理的便捷性。
Spring DAO：为JDBC DAO 抽象层提供了有意义的异常层次结构，可用该结构来管理异常处理和不同数据库供应商抛出的错误消息。异常层次结构简化了错误处理，并且极大地降低了需要编写的异常代码数量（例如打开和关闭连接）。Spring DAO 的面向 JDBC 的异常遵从通用的 DAO 异常层次结构。
Spring ORM：Spring 框架插入了若干个 ORM 框架，从而提供了 ORM 的对象关系工具，其中包括 JDO、Hibernate 和 iBatis SQL Map。所有这些都遵从 Spring 的通用事务和 DAO 异常层次结构。
Spring Web 模块：Web 上下文模块建立在应用程序上下文模块之上，为基于 Web 的应用程序提供了上下文。所以，Spring 框架支持与 Jakarta Struts 的集成。Web 模块还简化了处理多部分请求以及将请求参数绑定到域对象的工作。
Spring MVC 框架：MVC 框架是一个全功能的构建 Web 应用程序的 MVC 实现。通过策略接口，MVC 框架变成为高度可配置的，MVC 容纳了大量视图技术，其中包括 JSP、Velocity、Tiles、iText 和 POI。