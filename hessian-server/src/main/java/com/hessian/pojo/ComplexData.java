/**
* ClassName : ComplexData.java
* Create on ：2016年5月20日
* Copyrights 2016 guanfl All rights reserved.
* Email : guanfl@163.com
*/
package com.hessian.pojo;

import java.io.Serializable;
import java.util.List;

public class ComplexData implements Serializable {

    private static final long serialVersionUID = -8897595592894347024L;

    private List<HelloBean> beanList;

    private int number;

    public List<HelloBean> getBeanList() {
        return beanList;
    }

    public void setBeanList(List<HelloBean> beanList) {
        this.beanList = beanList;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    public void setData(List<HelloBean> list, int num){
        this.beanList = list ;
        this.number = num ;
    }

}
