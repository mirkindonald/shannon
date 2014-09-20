/**
 * 
 */
package com.shannon.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.shannon.bean.TimesheetBean;
import com.shannon.dao.LabourDao;
import com.shannon.dao.ProjectCodeDao;
import com.shannon.dao.ProjectDao;
import com.shannon.dao.TimeSheetDao;
import com.shannon.model.Labour;
import com.shannon.model.ProjectCode;
import com.shannon.model.ProjectNumber;
import com.shannon.model.Timesheet;
import com.shannon.model.TimesheetPK;
import com.shannon.service.TimeSheetService;
import com.shannon.utils.NormalTimeConverter;

/**
 * @author Mirkin
 *
 */
public class TimeSheetServiceImpl implements TimeSheetService {

	@Autowired
	private TimeSheetDao timeSheetDao;
	@Autowired
	private ProjectCodeDao projectCodeDao;

	@Autowired
	private ProjectDao projectDao;
	@Autowired
	private LabourDao labourDao;
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	@Override
	public Iterable<Labour> getAllLabours() throws Exception {
		return labourDao.findAll();
	}

	@Override
	public Iterable<ProjectCode> getAllprojectCodes() throws Exception {
		return projectCodeDao.findAll();
	}

	@Override
	public Iterable<ProjectNumber> getAllProjects() throws Exception {
		return projectDao.findAll();
	}

	@Override
	public Timesheet addDailyEmpInTime(String employeeId, String projectCodeId, String jobId) throws Exception {

		Timesheet timeSheet = new Timesheet();
		TimesheetPK id = new TimesheetPK();
		Date todayDate = new Date();
		todayDate.setSeconds(00);
		todayDate.setHours(00);
		todayDate.setMinutes(00);
		id.setDate(todayDate);
		id.setEmployeeId(employeeId);
		timeSheet.setId(id);
		timeSheet.setProjectId(projectCodeId);
		timeSheet.setProjectCode(jobId);
		timeSheet.setTimeIn(new Date());
		return timeSheetDao.save(timeSheet);
	}

	@Override
	public Timesheet updateEmpTimesheet(String employeeId, String timeOutHr, String timeOutMin, String breakHr,
			String overTimeHr) throws Exception {
		Date date =new Date();
		date.setHours(00);
		date.setMinutes(00);
		date.setSeconds(00);
		String dateToday = dateFormat.format(date);
		TimesheetPK pk = new TimesheetPK();
		System.out.println(employeeId);
		pk.setEmployeeId(employeeId);
		Timesheet timeSheet = timeSheetDao.findByEmpId(employeeId, dateToday);
		System.out.println(timeSheet);
		Date timeOut = new Date();
		timeOut.setHours(Integer.parseInt(timeOutHr));
		timeOut.setMinutes(Integer.parseInt(timeOutMin));
		timeSheet.setTimeOut(timeOut);
		timeSheet.setBreakHrs(Integer.parseInt(breakHr));
		timeSheet.setOverTimeHrs(Integer.parseInt(overTimeHr));
		return timeSheetDao.save(timeSheet);
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<TimesheetBean> getTodaysTimesheet() throws Exception {
		Iterable<Timesheet> timeSheetItr = timeSheetDao.findAll();
		Iterator<Timesheet> iterator = timeSheetItr.iterator();
		List<TimesheetBean> timeSheetBeanLst = new ArrayList<TimesheetBean>();
		while (iterator.hasNext()) {
			Timesheet timesheet = iterator.next();
			TimesheetBean timesheetBean = new TimesheetBean();
			timesheetBean.setBreakHrs(timesheet.getBreakHrs() + "");
			timesheetBean.setprojectCodeId(timesheet.getProjectId() + "");
			System.out.println(timesheet.getId());
			Labour labour = labourDao.findOne(timesheet.getId().getEmployeeId());
			String employeeName = labour.getFirstName() + " " + labour.getLastName();
			timesheetBean.setEmployeeName(employeeName);
			timesheetBean.setEmployeeId(timesheet.getId().getEmployeeId());
			timesheetBean.setJobId(timesheet.getProjectCode());
			timesheetBean.setOverTimeHrs(timesheet.getOverTimeHrs() + "");
			if (timesheet.getTimeIn() != null) {
				timesheetBean.setTimeInHr(NormalTimeConverter.toNormal(timesheet.getTimeIn().getHours() + ""));
				timesheetBean.setTimeInMin(timesheet.getTimeIn().getMinutes() + "");
			} else {
				timesheetBean.setTimeInHr("00");
				timesheetBean.setTimeInMin("00");
			}
			if (timesheet.getTimeOut() != null) {
				timesheetBean.setTimeOutHr(NormalTimeConverter.toNormal(timesheet.getTimeOut().getHours() + ""));
				timesheetBean.setTimeOutMin(timesheet.getTimeOut().getMinutes() + "");
			} else {
				timesheetBean.setTimeOutHr("00");
				timesheetBean.setTimeOutMin("00");
			}
			timesheet.setBreakHrs(timesheet.getBreakHrs());
			timesheet.setOverTimeHrs(timesheet.getOverTimeHrs());
			timeSheetBeanLst.add(timesheetBean);
		}
		return timeSheetBeanLst;

	}
}
