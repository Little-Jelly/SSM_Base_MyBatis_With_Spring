package com.yyf.mybatisPlusSpring.dao.DAO;

import com.yyf.mybatisPlusSpring.dao.POJO.Customer;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class B_CustomerDao extends SqlSessionDaoSupport implements I_CustomerDao {
    @Override
    public Customer findCustomerById(Integer id) {
        return this.getSqlSession().selectOne("com.yyf.mybatisPlusSpring.dao.mapper.CustomerDao.findCustomerById", id);
    }
}
