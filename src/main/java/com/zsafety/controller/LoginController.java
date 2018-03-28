package com.zsafety.controller;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

@RestController
@RequestMapping(value="/login")
public class LoginController {

	@RequestMapping(value="login",method=RequestMethod.POST)
	@ResponseBody
	public JSONObject login(@RequestHeader(value="username") String userName,
			@RequestHeader(value="password") String password){
		
		JSONObject result = new JSONObject();
		result.put("data", "login");
		return result;
	}
}
