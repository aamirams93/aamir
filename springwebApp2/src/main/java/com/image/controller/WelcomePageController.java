package com.image.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomePageController
{
	@GetMapping("/wish")
	public ModelAndView getWelcome()
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg","Hi User");
		mv.setViewName("wish");
		return mv;
	}
}
;