package net.radu.Frontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@RequestMapping(value = {"/", "/home", "/index"})
	public ModelAndView index(){
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Home");
		mv.addObject("userClickHome",true);
		return mv;
	}
	
	@RequestMapping(value = "/report")
	public ModelAndView report(){
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Report");
		mv.addObject("userClickReport",true);
		return mv;
	}
	
	@RequestMapping(value = "/reportedEvents")
	public ModelAndView reportedEvents(){
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Reported Events");
		mv.addObject("userClickReportedEvents",true);
		return mv;
	}
	
//	@RequestMapping(value = "/test")
//	public ModelAndView test(@RequestParam(value="greeting", required=false)String greeting){
//		if(greeting == null)
//			greeting = "A fost null :/";
//		
//		ModelAndView mv = new ModelAndView("page");
//		mv.addObject("greeting",greeting);
//		return mv;
//		
//	}
//	
//	@RequestMapping(value = "/test/{greeting}")
//	public ModelAndView test(@PathVariable("greeting")String greeting){
//		if(greeting == null)
//			greeting = "A fost null :/";
//		
//		ModelAndView mv = new ModelAndView("page");
//		mv.addObject("greeting",greeting);
//		return mv;
//		
//	}
}
