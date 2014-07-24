package com.niuniu.app.user.domain;

/**
 * 用户登录信息实体
 * 
 * @author niuliwei
 * 
 */
public class LoginKey {
	private int loginId;// id
	private String loginName;// 登录名称
	private String password;// 登录密码

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getLoginId() {
		return loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}

}
