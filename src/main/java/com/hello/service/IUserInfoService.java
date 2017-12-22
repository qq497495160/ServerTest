package com.hello.service;

import org.springframework.data.repository.CrudRepository;

import com.hello.bean.DemoBean;


public interface IUserInfoService extends CrudRepository<DemoBean, Long> {

    public DemoBean findById(int id);

}
