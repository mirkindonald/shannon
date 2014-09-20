package com.shannon.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the timesheet database table.
 * 
 */
@Embeddable
public class TimesheetPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date date;

	@Column(name="employee_id")
	private String employeeId;

	public TimesheetPK() {
	}
	public java.util.Date getDate() {
		return this.date;
	}
	public void setDate(java.util.Date date) {
		this.date = date;
	}
	public String getEmployeeId() {
		return this.employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TimesheetPK)) {
			return false;
		}
		TimesheetPK castOther = (TimesheetPK)other;
		return 
			this.date.equals(castOther.date)
			&& this.employeeId.equals(castOther.employeeId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.date.hashCode();
		hash = hash * prime + this.employeeId.hashCode();
		
		return hash;
	}
}