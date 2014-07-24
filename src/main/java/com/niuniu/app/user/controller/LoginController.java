package com.niuniu.app.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niuniu.app.user.dao.LoginDao;
import com.niuniu.app.user.domain.LoginKey;

@Controller
public class LoginController {
	@Autowired
	private LoginDao loginDao;

	@RequestMapping("/login")
	public String login(LoginKey key, Model model) {
		loginDao.addLoginner(key);
		return "success";
	}
}
