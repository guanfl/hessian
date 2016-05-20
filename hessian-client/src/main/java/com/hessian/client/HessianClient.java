/**
* ClassName : HessianClient.java
* Create on ：2016年5月20日
* Copyrights 2016 guanfl All rights reserved.
* Email : guanfl@163.com
*/
package com.hessian.client;

import java.net.MalformedURLException;
import java.util.List;

import com.caucho.hessian.client.HessianProxyFactory;
import com.hessian.dao.IHello;
import com.hessian.pojo.HelloBean;

/**从暴露的接口中获取数据<br>*/
public class HessianClient {
    private static final String URL = "http://127.0.0.1:8080/hessian/service";

    public static void main(String[] args) {
        HessianProxyFactory factory = new HessianProxyFactory();

        try {
            IHello hello = (IHello) factory.create(IHello.class, URL);
            List<HelloBean> list = hello.getBeanList();
            System.out.println(list);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
