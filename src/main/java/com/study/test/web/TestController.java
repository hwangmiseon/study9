package com.study.test.web;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.test.service.ITestService;

@Controller
public class TestController {
	@Inject
	ITestService testService;
	
	@RequestMapping("/test/test.wow")
	public String test(Model model) {
		String test = testService.test();
		model.addAttribute("test", test);
		return "test/test";
	}
	
}
