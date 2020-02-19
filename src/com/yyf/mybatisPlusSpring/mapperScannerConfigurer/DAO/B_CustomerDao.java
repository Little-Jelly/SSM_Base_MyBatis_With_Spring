package com.yyf.mybatisPlusSpring.mapperScannerConfigurer.DAO;

import com.yyf.mybatisPlusSpring.mapperScannerConfigurer.POJO.Customer;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class B_CustomerDao extends SqlSessionDaoSupport implements I_CustomerDao {
    @Override
    public Customer findCustomerById(Integer id) {
        return this.getSqlSession().selectOne("com.yyf.mybatisPlusSpring.mapperScannerConfigurer.mapper.CustomerMapper.findCustomerById", id);
    }
}
