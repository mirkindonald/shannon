package com.shannon.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the labour database table.
 * 
 */
@Entity
@NamedQuery(name="Labour.findAll", query="SELECT l FROM Labour l")
public class Labour implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="employee_id")
	private String employeeId;

	private String address;

	@Column(name="blood_group")
	private String bloodGroup;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dob;

	@Temporal(TemporalType.TIMESTAMP)
	private Date doj;

	@Column(name="father_name")
	private String fatherName;

	@Column(name="first_name")
	private String firstName;

	private String gender;

	@Column(name="last_name")
	private String lastName;

	@Column(name="middle_name")
	private String middleName;

	private String mobile;

	@Column(name="ot_sal_per_hr")
	private int otSalPerHr;

	@Column(name="salary_per_hr")
	private int salaryPerHr;

	public Labour() {
	}

	public String getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBloodGroup() {
		return this.bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getDoj() {
		return this.doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public String getFatherName() {
		return this.fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public int getOtSalPerHr() {
		return this.otSalPerHr;
	}

	public void setOtSalPerHr(int otSalPerHr) {
		this.otSalPerHr = otSalPerHr;
	}

	public int getSalaryPerHr() {
		return this.salaryPerHr;
	}

	public void setSalaryPerHr(int salaryPerHr) {
		this.salaryPerHr = salaryPerHr;
	}

}