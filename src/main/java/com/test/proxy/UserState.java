package com.test.proxy;

import java.util.ArrayList;
import java.util.List;

import com.test.bean.UserBean;

public class UserState {

	private List<UserProxy> beans = new ArrayList<UserProxy>();

	public void addBeans(UserProxy proxy){
		beans.add(proxy);
	}
	
	public int size() {
		return beans.size();
	}
	
	public UserBean getUserBean() {
		if (beans != null && !beans.isEmpty()) {
			return beans.remove(0).getUserBean();
		}
		return null;
	}

}
