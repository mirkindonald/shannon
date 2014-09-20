package com.shannon.bean;

import java.io.Serializable;

public class TimesheetBean implements Serializable {
	private static final long serialVersionUID = 1L;

	private String employeeId;
	private String employeeName;
	private String jobId;
	private String projectCodeId;
	private String overTimeHrs;
	private String timeInHr;
	private String timeInMin;
	private String timeOutHr;
	private String timeOutMin;
	private String breakHrs;

	/**
	 * @return the employeeId
	 */
	public String getEmployeeId() {
		return employeeId;
	}

	/**
	 * @param employeeId
	 *            the employeeId to set
	 */
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}

	/**
	 * @param employeeName
	 *            the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	/**
	 * @return the jobId
	 */
	public String getJobId() {
		return jobId;
	}

	/**
	 * @param jobId
	 *            the jobId to set
	 */
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	/**
	 * @return the projectCodeId
	 */
	public String getprojectCodeId() {
		return projectCodeId;
	}

	/**
	 * @param projectCodeId
	 *            the projectCodeId to set
	 */
	public void setprojectCodeId(String projectCodeId) {
		this.projectCodeId = projectCodeId;
	}

	/**
	 * @return the overTimeHrs
	 */
	public String getOverTimeHrs() {
		return overTimeHrs;
	}

	/**
	 * @param overTimeHrs
	 *            the overTimeHrs to set
	 */
	public void setOverTimeHrs(String overTimeHrs) {
		this.overTimeHrs = overTimeHrs;
	}

	/**
	 * @return the timeInHr
	 */
	public String getTimeInHr() {
		return timeInHr;
	}

	/**
	 * @param timeInHr
	 *            the timeInHr to set
	 */
	public void setTimeInHr(String timeInHr) {
		this.timeInHr = timeInHr;
	}

	/**
	 * @return the timeInMin
	 */
	public String getTimeInMin() {
		return timeInMin;
	}

	/**
	 * @param timeInMin
	 *            the timeInMin to set
	 */
	public void setTimeInMin(String timeInMin) {
		this.timeInMin = timeInMin;
	}

	/**
	 * @return the timeOutHr
	 */
	public String getTimeOutHr() {
		return timeOutHr;
	}

	/**
	 * @param timeOutHr
	 *            the timeOutHr to set
	 */
	public void setTimeOutHr(String timeOutHr) {
		this.timeOutHr = timeOutHr;
	}

	/**
	 * @return the timeOutMin
	 */
	public String getTimeOutMin() {
		return timeOutMin;
	}

	/**
	 * @param timeOutMin
	 *            the timeOutMin to set
	 */
	public void setTimeOutMin(String timeOutMin) {
		this.timeOutMin = timeOutMin;
	}

	/**
	 * @return the breakHrs
	 */
	public String getBreakHrs() {
		return breakHrs;
	}

	/**
	 * @param breakHrs
	 *            the breakHrs to set
	 */
	public void setBreakHrs(String breakHrs) {
		this.breakHrs = breakHrs;
	}
}