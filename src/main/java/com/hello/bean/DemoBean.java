package com.hello.bean;

import java.io.Serializable;

import javax.persistence.*;


public class DemoBean{

    private static final long serialVersionUID = 2120869894112984147L;


    private int id;//主键.
    private String name;//名字.
    private String xb;
    private String csny;

    public void setId(int id) {
       this.id =id;
    }

    public int getId() {
       return id;
    }

    public void setName(String name) {
       this.name =name;
    }

    public String getName() {
       return name;
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
