package cn.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.dao.LoginMapper;
import cn.service.LoginService;

@Service("loginService")
public class LoginServiceImpl implements LoginService{

	@Resource
	private LoginMapper loginMapper;
	
	public LoginMapper getLoginMapper() {
		return loginMapper;
	}
	public void setLoginMapper(LoginMapper loginMapper) {
		this.loginMapper = loginMapper;
	}
	/**
	 * µÇÂ¼
	 */
	public int toLogin(String devCode, String devPassword) {
		return loginMapper.toLogin(devCode, devPassword);
	}
	
	
}
