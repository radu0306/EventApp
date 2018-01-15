package net.radu.Frontend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

//import net.radu.Backend.dao.EventDAO;
import net.radu.Frontend.obj.Event;



//import net.radu.Backend2.dao.EvenimentDAO;


@Controller
public class PageController {

//	@Autowired
//	private EventDAO evenimentDAO;
	
	@Autowired
	 private Event event;
	
	@RequestMapping(value = {"/", "/home", "/index"})
	public ModelAndView index(){
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Home");
		mv.addObject("userClickHome",true);
		return mv;
	}
	
//	@RequestMapping(value = "/report")
//	public ModelAndView report(){
//		ModelAndView mv = new ModelAndView("report");
//		mv.addObject("title","Report");
//		mv.addObject("userClickReport",true);
//		return mv;
//	}
	
	@RequestMapping(value = "/reportedEvents")
	public ModelAndView reportedEvents(){
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Reported Events");
		
		mv.addObject("events", event.list());

		
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
