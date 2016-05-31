package com.mybatis;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.mybatis.dao.CustomerMapper;
import com.mybatis.dto.CustomerDTO;

public class CustomerTest {

	public static void main(String[] args) {
		try {
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder()
					.build(Resources.getResourceAsStream("mybatis-config.xml"));
			SqlSession session = sessionFactory.openSession();
			/*
			 * CustomerDTO customerDTO = session.selectOne(
			 * "com.mybatis.dao.CustomerMapper.selectCustomer", 171);
			 */
			CustomerMapper customerMapper = session
					.getMapper(CustomerMapper.class);
			CustomerDTO customerDTO = customerMapper.selectCustomer(171);

			System.out.println(customerDTO);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
