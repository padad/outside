package com.padad.outside.model;

import java.util.List;

public class UserRecord<T> {
	private List<T> userInfo;
	private int count;
	public List<T> getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(List<T> userInfo) {
		this.userInfo = userInfo;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}
