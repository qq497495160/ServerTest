package com.hello.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.hello.bean.DemoBean;


@Service
public class DemoBeanService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<DemoBean> getList(){
    	System.out.println("Caonima中国》》》》》》》》》 进来了");
        String sql = "SELECT id, xm, xb, csny FROM name";
        return (List<DemoBean>) jdbcTemplate.query(sql, new RowMapper<DemoBean>(){

            @Override
            public DemoBean mapRow(ResultSet rs, int rowNum) throws SQLException {
            	System.out.println("Caonima中国》》》》》》》》》");
            	DemoBean demo = new DemoBean();
            	demo.setId(rs.getInt("id"));
                demo.setName(rs.getString("xm"));
                demo.setXb(rs.getString("xb"));
                demo.setCsny(rs.getString("csny"));
                return demo;
            }
        });
    }
    
    public List<DemoBean> save(DemoBean demo){
    	System.out.println("Caonima中国》》》》》》》》》 进来了");
        String sql = "SELECT id, xm, xb, csny FROM name";
        return (List<DemoBean>) jdbcTemplate.query(sql, new RowMapper<DemoBean>(){

            @Override
            public DemoBean mapRow(ResultSet rs, int rowNum) throws SQLException {
            	System.out.println("Caonima中国》》》》》》》》》");
            	DemoBean demo = new DemoBean();
            	demo.setId(rs.getInt("id"));
                demo.setName(rs.getString("xm"));
                demo.setXb(rs.getString("xb"));
                demo.setCsny(rs.getString("csny"));
                return demo;
            }

        });
    }
}
