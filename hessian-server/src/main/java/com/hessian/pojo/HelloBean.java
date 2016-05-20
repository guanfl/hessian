/**
* ClassName : HelloBean.java
* Create on ：2016年5月20日
* Copyrights 2016 guanfl All rights reserved.
* Email : guanfl@163.com
*/
package com.hessian.pojo;

import java.io.Serializable;

public class HelloBean implements Serializable {
    private static final long serialVersionUID = 7263478129655139155L;

    private String name;
    private int age;

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "HelloBean [name=" + name + ", age=" + age + "]";
    }

}
