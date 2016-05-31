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
		System.out.println("���ӳ��д���������"+ userState.size());
		UserBean userBean = userState.getUserBean();
		System.out.println("��ȡһ�����ӳغ��������"+ userState.size());
		System.out.println(userBean.toString());
		userBean.close();
		System.out.println("�رպ�����ӳ�������"+ userState.size());
	}
	
}

