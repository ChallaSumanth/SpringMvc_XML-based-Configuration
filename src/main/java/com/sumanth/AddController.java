package com.sumanth;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sumanth.service.AddService;

@Controller
public class AddController {

	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response)
	{
		ModelAndView mv = new ModelAndView();
		
		int i = Integer.parseInt(request.getParameter("num1"));
		
		int j = Integer.parseInt(request.getParameter("num2"));
		
		AddService as = new AddService();
		
		int k = as.add(i, j);
		
		mv.setViewName("display.jsp");
		mv.addObject("result",k);
		return mv;
		
	}
}
