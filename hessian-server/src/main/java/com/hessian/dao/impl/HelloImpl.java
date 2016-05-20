/**
* ClassName : HelloImpl.java
* Create on ：2016年5月20日
* Copyrights 2016 guanfl All rights reserved.
* Email : guanfl@163.com
*/
package com.hessian.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.hessian.dao.IHello;
import com.hessian.pojo.ComplexData;
import com.hessian.pojo.HelloBean;

public class HelloImpl implements IHello {

    @Override
    public String sayHello(String msg) {

        return "Hello" + msg;
    }

    @Override
    public void sayHello2(int num) {
        System.out.println("HELLO: " + num);
    }

    @Override
    public void print(String msg) {
        System.out.println(msg);
    }

    @Override
    public HelloBean getData() {
        HelloBean bean = new HelloBean();
        bean.setAge(12);
        bean.setName("name");
        System.out.println(bean);
        return bean;
    }

    @Override
    public List<HelloBean> getBeanList() {
        List<HelloBean> beans = new ArrayList<HelloBean>();
        HelloBean b1 = new HelloBean();
        b1.setName("lu1");
        b1.setAge(26);
        beans.add(b1);

        HelloBean b2 = new HelloBean();
        b2.setName("lu2");
        b2.setAge(27);
        beans.add(b2);
        return beans;
    }

    @Override
    public ComplexData getComplexData() {
        ComplexData data = new ComplexData();
        List<HelloBean> list = this.getBeanList();
        data.setData(list, list.size());
        return data;
    }

}
