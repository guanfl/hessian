/**
* ClassName : IHello.java
* Create on ：2016年5月20日
* Copyrights 2016 guanfl All rights reserved.
* Email : guanfl@163.com
*/
package com.hessian.dao;

import java.util.List;

import com.hessian.pojo.ComplexData;
import com.hessian.pojo.HelloBean;

public interface IHello {
    
    public String sayHello(String msg);
    
    public abstract void sayHello2(int num);
    
    public void print(String msg);
    
    List<HelloBean> getBeanList();
    
    ComplexData getComplexData();

    HelloBean getData();
    
}
