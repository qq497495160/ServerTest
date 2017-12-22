package com.hello.bean;

import java.io.Serializable;

import javax.persistence.*;

@Entity //bean，用JPA方式需要对Bean文件进行注解
@Table(name = "name") //如果不注解，默认表名就是这个demo_bean
public class DemoBean{

    private static final long serialVersionUID = 2120869894112984147L;
    
    @Id //如果是Entity，则需要注解Id， No identifier specified for entity
    @GeneratedValue(strategy = GenerationType.AUTO) //自动增加
    private int id;//主键.

    private String xm;//名字.
    private String xb;
    private String csny;

    public void setId(int id) {
       this.id =id;
    }

    public int getId() {
       return id;
    }

    public void setXm(String xm) {
       this.xm =xm;
    }

    public String getXm() {
       return xm;
    }

    public void setXb(String xb) {
        this.xb = xb;
    }

    public String getXb() {
        return xb;
    }

    public void setCsny(String csny) {
        this.csny = csny;
    }

    public String getCsny() {
        return csny;
    }
}
