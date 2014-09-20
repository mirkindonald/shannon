package com.shannon.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the timesheet database table.
 * 
 */
@Entity
@NamedQuery(name="Timesheet.findAll", query="SELECT t FROM Timesheet t")
public class Timesheet implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TimesheetPK id;

	@Column(name="break_hrs")
	private int breakHrs;

	@Column(name="day_desc")
	private String dayDesc;

	@Column(name="over_time_hrs")
	private int overTimeHrs;

	@Column(name="project_code")
	private String projectCode;

	@Column(name="project_id")
	private String projectId;

	@Column(name="salary_today")
	private int salaryToday;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="time_in")
	private Date timeIn;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="time_out")
	private Date timeOut;

	@Column(name="timesheet_closed")
	private byte timesheetClosed;

	public Timesheet() {
	}

	public TimesheetPK getId() {
		return this.id;
	}

	public void setId(TimesheetPK id) {
		this.id = id;
	}

	public int getBreakHrs() {
		return this.breakHrs;
	}

	public void setBreakHrs(int breakHrs) {
		this.breakHrs = breakHrs;
	}

	public String getDayDesc() {
		return this.dayDesc;
	}

	public void setDayDesc(String dayDesc) {
		this.dayDesc = dayDesc;
	}

	public int getOverTimeHrs() {
		return this.overTimeHrs;
	}

	public void setOverTimeHrs(int overTimeHrs) {
		this.overTimeHrs = overTimeHrs;
	}

	public String getProjectCode() {
		return this.projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public int getSalaryToday() {
		return this.salaryToday;
	}

	public void setSalaryToday(int salaryToday) {
		this.salaryToday = salaryToday;
	}

	public Date getTimeIn() {
		return this.timeIn;
	}

	public void setTimeIn(Date timeIn) {
		this.timeIn = timeIn;
	}

	public Date getTimeOut() {
		return this.timeOut;
	}

	public void setTimeOut(Date timeOut) {
		this.timeOut = timeOut;
	}

	public byte getTimesheetClosed() {
		return this.timesheetClosed;
	}

	public void setTimesheetClosed(byte timesheetClosed) {
		this.timesheetClosed = timesheetClosed;
	}

}