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
	 * Ìø×ªµ½µÇÂ¼Ò³Ãæ
	 * @return
	 */
	@RequestMapping("/toLogin")
	public String toLoing(){
		return "/devlogin";
	}
	/**
	 * µÇÂ¼²Ù×÷
	 */
	//public String
}
