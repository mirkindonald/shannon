/**
 * 
 */
package com.shannon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Mirkin
 *
 */
@Controller
public class AdminController extends BaseController{
	
	@RequestMapping(value="/labourEntry")
	public ModelAndView getLabourEntry(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("labourEntry");
		return mav;
	}
	
	@RequestMapping(value="/labourView")
	public ModelAndView getLabourView(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("labourView");
		return mav;
	}
	
	@RequestMapping(value="/paySlip")
	public ModelAndView getPaySlip(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("paySlip");
		return mav;
	}
	
	@RequestMapping(value="/projectCosts")
	public ModelAndView getPrjCost(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("projectCosts");
		return mav;
	}
}
