# hessian
hessian 服务端和客户端demo，并且集成了spring

#hessian-server
1、设计一个接口，给客户端调用
2、实现该接口
3、web.xml中配置DispatcherServlet
4、spring-mvc.xml中将hession接口导出为hessian服务
<!-- 导出一个hessian服务 -->
<bean id="hessianHelloService" class="org.springframework.remoting.caucho.HessianServiceExporter">
	<property name="service" ref="hello"/>
	<property name="serviceInterface" value="com.hessian.dao.IHello"/>
</bean>
5、重要的是将DispatcherServlet分派来的请求映射到HessionService进行处理
<bean id = "urlMapping" class="org.springframework.web.servlet.handler.SimpleUrlHandlerMapping">
<property name="mappings">
	<value>
		/hello.service = hessianHelloService
	</value>
</property>
</bean>

#hessian-client