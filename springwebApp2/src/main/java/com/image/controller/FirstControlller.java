package com.image.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstControlller
{
	@GetMapping("/welcome")
	public ModelAndView getWelcomeMsg()
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg","Hi welcome to our portal");
		mv.setViewName("welcome");
		return mv;
	}
	@GetMapping("/portal")
	public ModelAndView getPortal()
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg","Portal");
		mv.setViewName("welcome");
		return mv;
	}
}
