package com.hsmdata.springTest.modules.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hsmdata.springTest.modules.entity.TestModel;

@Controller
@RequestMapping("/binder")
public class BinderController {

	@RequestMapping("test.do")
	public ModelAndView test(boolean b, ModelAndView view) {
		view.setViewName("test");
		if (b) {
			view.addObject("attr", "b is true");
		} else {
			view.addObject("attr", "b is false");
		}
		return view;
	}

	@RequestMapping("testClass.do")
	public ModelAndView test(TestModel model, ModelAndView view) {
		view.setViewName("test");
		view.addObject("attr", model.toString());
		return view;
	}

}
