package com.hello.bean;

public class DemoBean {
    private long id;//主键.
    private String name;//测试名称.

    public void setId(long id) {
       this.id =id;
    }

    public long getId() {
       return id;
    }

    public void setName(String name) {
       this.name =name;
    }

    public String getName() {
       return name;
    }
}
