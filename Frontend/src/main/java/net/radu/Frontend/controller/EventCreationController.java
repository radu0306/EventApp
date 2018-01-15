package net.radu.Frontend.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//import net.radu.Backend.dao.EventDAO;
//import net.radu.Backend.dao.UserDAO;
//import net.radu.Backend.dto.Event;
import net.radu.Frontend.obj.Event;
import net.radu.Frontend.services.PictureUploadUtility;
import net.radu.Frontend.services.SendEmail;

//when backedn and front worked
//import net.radu.Backend.dao.Event;

@Controller

public class EventCreationController {

	/**
	 * @return
	 */
	
//	@Autowired
//	EventDAO eventDAO;
	
//	@Autowired
//	UserDAO userDAO;
	
	@RequestMapping(value = "/report", method=RequestMethod.GET)
	public ModelAndView report(){
		ModelAndView mv = new ModelAndView("report");
		mv.addObject("title","Report");
		mv.addObject("userClickReport",true);
		
		Event newEvent = new Event();
		mv.addObject("event",newEvent);
		return mv;
	}
	
	//handling event submition
	@RequestMapping(value = "/report", method=RequestMethod.POST)
	public String handleEventSubmition(@ModelAttribute("event") Event mEvent, HttpServletRequest request){
		
		//create a new event
//		eventDAO.add(mEvent);
		
		//sending emails to admins
		SendEmail send = new SendEmail();
//		send.sendEmail(userDAO.getAdmins(), mEvent);
		
		
		//there is a picture available in the picture element
		if(!mEvent.getPicture().getOriginalFilename().equals("")){
			PictureUploadUtility.uploadFile(request,mEvent.getPicture()); 
		}
		
		return "redirect:/Frontend";
	}
}
