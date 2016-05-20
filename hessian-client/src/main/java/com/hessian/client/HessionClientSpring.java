/**
* ClassName : HessionClientSpring.java
* Create on ：2016年5月20日
* Copyrights 2016 guanfl All rights reserved.
* Email : guanfl@163.com
*/
package com.hessian.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hessian.dao.IHello;
import com.hessian.pojo.HelloBean;

public class HessionClientSpring {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-hessian-client.xml");
        IHello hello = (IHello)context.getBean("myServiceClient");
        List<HelloBean> list = hello.getBeanList();
        System.out.println(list);
    }

}
