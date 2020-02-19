package com.yyf.mybatisPlusSpring.dao.DAO;

import com.yyf.mybatisPlusSpring.dao.POJO.Customer;

public interface I_CustomerDao {
    public Customer findCustomerById(Integer id);
}
