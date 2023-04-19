package com.jpa.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestControll {

	@RequestMapping("/test")
	@ResponseBody
	public String test()
	{
		int a=20;
		int b=90;
		int c=70;
		return "this is testing and the sum is "+(a+b+c);
	}
}
