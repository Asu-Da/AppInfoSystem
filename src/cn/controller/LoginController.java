package cn.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.service.LoginService;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Resource
	private LoginService loginService;
	
	/**
	 * ��ת����¼ҳ��
	 * @return
	 */
	@RequestMapping("/toLogin")
	public String toLoing(){
		return "/devlogin";
	}
	/**
	 * ��¼����
	 */
	//public String
}
