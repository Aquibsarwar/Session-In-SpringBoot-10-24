package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoursesController {
	
	@RequestMapping("courses")
	public ModelAndView courses(@RequestParam("cname")String coursename, HttpSession session){
	
	//HttpSession session = req.getSession();
		ModelAndView mv = new ModelAndView();
		mv.addObject("cname", coursename);
		mv.setViewName("Courses");
		return mv;
		//String cname = req.getParameter("cname");
		//session.setAttribute("cname", cname);
	}


	
	
	
}
