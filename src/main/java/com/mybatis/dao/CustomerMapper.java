package com.mybatis.dao;

import com.mybatis.dto.CustomerDTO;

public interface CustomerMapper {

	CustomerDTO selectCustomer(Integer cusId);

}
