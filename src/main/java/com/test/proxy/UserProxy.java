package com.test.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.test.bean.UserBean;

public class UserProxy implements InvocationHandler {

	private static final String CLOSE = "close";
	private static final Class<?>[] IFACES = new Class<?>[] { UserBean.class };

	private UserState userState;

	private UserBean proxyUserBean;
	private UserBean realUserBean;

	public UserProxy(UserBean bean, UserState state) {
		this.userState = state;
		this.realUserBean = bean;
		this.proxyUserBean = (UserBean) Proxy.newProxyInstance(
				UserBean.class.getClassLoader(), IFACES, this);
	}

	public UserBean getUserBean() {
		return proxyUserBean;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		String methodName = method.getName();
		if (CLOSE.hashCode() == methodName.hashCode()
				&& CLOSE.equals(methodName)) {
			System.out.println("close....");
			userState.addBeans(this);
			return null;
		}
		return method.invoke(realUserBean, args);
	}

}
