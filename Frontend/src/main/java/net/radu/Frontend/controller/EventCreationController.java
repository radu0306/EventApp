package net.radu.Frontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.radu.Frontend.obj.Event;

//import net.radu.Backend.dto.Event;

@Controller

public class EventCreationController {

	/**
	 * @return
	 */
	@RequestMapping(value = "/report")
	public ModelAndView report(){
		ModelAndView mv = new ModelAndView("report");
		mv.addObject("title","Report");
		mv.addObject("userClickReport",true);
		
		Event newEvent = new Event();
		mv.addObject("event",newEvent);
		return mv;
	}
}
