package com.yyf.mybatisPlusSpring.mapperScannerConfigurer.DAO;

import com.yyf.mybatisPlusSpring.mapperScannerConfigurer.POJO.Customer;

public interface I_CustomerDao {
    public Customer findCustomerById(Integer id);
}
