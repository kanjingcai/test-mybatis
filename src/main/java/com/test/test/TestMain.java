package com.test.test;

import com.test.bean.UserBean;
import com.test.bean.UserBeanImpl;
import com.test.proxy.UserProxy;
import com.test.proxy.UserState;

public class TestMain {

	public static void main(String[] args) {
		
		UserState userState = new UserState();
		userState.addBeans(new UserProxy(new UserBeanImpl("admin"), userState));
		userState.addBeans(new UserProxy(new UserBeanImpl("test"), userState));
		System.out.println("连接池中存在数量："+ userState.size());
		UserBean userBean = userState.getUserBean();
		System.out.println("获取一个连接池后的数量："+ userState.size());
		System.out.println(userBean.toString());
		userBean.close();
		System.out.println("关闭后的连接池数量："+ userState.size());
	}
	
}

