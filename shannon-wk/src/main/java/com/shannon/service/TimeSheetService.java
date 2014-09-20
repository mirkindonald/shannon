/**
 * 
 */
package com.shannon.service;

import java.util.List;

import com.shannon.bean.TimesheetBean;
import com.shannon.model.ProjectCode;
import com.shannon.model.Labour;
import com.shannon.model.ProjectNumber;
import com.shannon.model.Timesheet;

/**
 * @author Mirkin
 *
 */
public interface TimeSheetService {
	public Iterable<Labour> getAllLabours() throws Exception;
	public Iterable<ProjectCode> getAllprojectCodes() throws Exception;
	public Iterable<ProjectNumber> getAllProjects() throws Exception;
	public List<TimesheetBean> getTodaysTimesheet() throws Exception;
	Timesheet addDailyEmpInTime(String employeeId, String projectCodeId, String jobId)throws Exception;
	/**
	 * @param employeeId
	 * @param projectCodeId
	 * @param jobId
	 * @param timeOutHr
	 * @param timeOutMin
	 * @return
	 * @throws Exception
	 */
	Timesheet updateEmpTimesheet(String employeeId, String timeOutHr, String timeOutMin, String breakhr, String overTimeHr)
			throws Exception;
}
