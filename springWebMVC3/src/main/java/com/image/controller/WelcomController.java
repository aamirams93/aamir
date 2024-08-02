package com.image.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomController
{
	@GetMapping("/welcome")
	public ModelAndView getWelcomemsg()
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", "welcome to or portal");
		mv.setViewName("welcome");
		return mv;
	}

}
