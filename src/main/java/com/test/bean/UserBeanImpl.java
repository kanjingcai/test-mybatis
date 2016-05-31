package com.test.bean;

public class UserBeanImpl implements UserBean {

	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public UserBeanImpl(String username) {
		this.username = username;
	}
	
	@Override
	public String toString() {
		return "UserBeanImpl [username=" + username + "]";
	}

	@Override
	public void close() {
		System.out.println("调用Close方法！");
	}

}
