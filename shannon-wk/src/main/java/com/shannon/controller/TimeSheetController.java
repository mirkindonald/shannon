/**
 * 
 */
package com.shannon.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shannon.bean.TimesheetBean;
import com.shannon.model.ProjectCode;
import com.shannon.model.Labour;
import com.shannon.model.ProjectNumber;
import com.shannon.service.TimeSheetService;

/**
 * @author Mirkin
 *
 */
@Controller
public class TimeSheetController extends BaseController {

	@Autowired
	TimeSheetService timeSheetService;

	public Iterable<Labour> labourItr;
	public Iterable<ProjectCode> projectCodeItr;
	public Iterable<ProjectNumber> projectItr;
	public List<TimesheetBean> timeSheetBean;

	@RequestMapping(value = "/timeSheet")
	public ModelAndView getTimeSheet() throws Exception {
		ModelAndView mav = new ModelAndView();
		try {
			timeSheetBean = timeSheetService.getTodaysTimesheet();
			labourItr = timeSheetService.getAllLabours();
			projectCodeItr = timeSheetService.getAllprojectCodes();
			projectItr = timeSheetService.getAllProjects();
			mav.addObject("labourItr", labourItr);
			mav.addObject("projectCodeItr", projectCodeItr);
			mav.addObject("todaysDate", getTodaysDate("dd-MM-yyyy"));
			mav.addObject("projectItr", projectItr);
			mav.addObject("timeSheetBean", timeSheetBean);
			mav.setViewName("timeSheet");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
		return mav;
	}

	@RequestMapping(value = "/addDailyEmpInTime")
	public ModelAndView setNewJob(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		String empId = request.getParameter("employeeId");
		String projectCodeId = request.getParameter("projectCodeId");
		String jobId = request.getParameter("projectId");
		if (empId.equalsIgnoreCase("none") && projectCodeId.equalsIgnoreCase("none") && jobId.equalsIgnoreCase("none")) {
			throw new Exception();
		}
		timeSheetService.addDailyEmpInTime(empId, projectCodeId, jobId);
		timeSheetBean = timeSheetService.getTodaysTimesheet();
		mav.setViewName("timeSheet");
		mav.addObject("labourItr", labourItr);
		mav.addObject("projectCodeItr", projectCodeItr);
		mav.addObject("todaysDate", getTodaysDate("dd-MM-yyyy"));
		mav.addObject("projectItr", projectItr);
		mav.addObject("timeSheetBean", timeSheetBean);
		mav.addObject("message", " New Job assigned to Employee Successfully");
		return mav;
	}

	@RequestMapping(value = "/updateTimesheet")
	public ModelAndView updateTimesheet(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		try {
			String empId = request.getParameter("employeeIdHidden");
			String timeOutHr = request.getParameter("timeOutHr_"+empId);
			String timeOutMin = request.getParameter("timeOutMin_"+empId);
			String breakHr = request.getParameter("breakHr_"+empId);
			String overTimeHr = request.getParameter("overTimeHr_"+empId);
			timeSheetService.updateEmpTimesheet(empId, timeOutHr, timeOutMin, breakHr, overTimeHr);
			timeSheetBean = timeSheetService.getTodaysTimesheet();
			mav.setViewName("timeSheet");
			mav.addObject("labourItr", labourItr);
			mav.addObject("projectCodeItr", projectCodeItr);
			mav.addObject("todaysDate", getTodaysDate("dd-MM-yyyy"));
			mav.addObject("projectItr", projectItr);
			mav.addObject("timeSheetBean", timeSheetBean);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
		return mav;
	}

	public static void main(String arg[]) {

	}
}
