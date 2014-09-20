package com.shannon.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the project_number database table.
 * 
 */
@Entity
@Table(name="project_number")
@NamedQuery(name="ProjectNumber.findAll", query="SELECT p FROM ProjectNumber p")
public class ProjectNumber implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="project_end_date")
	private String projectEndDate;

	@Column(name="project_no")
	private String projectNo;

	@Column(name="project_start_date")
	private String projectStartDate;

	//bi-directional many-to-one association to ProjectCode
	@ManyToOne
	@JoinColumn(name="project_code_id")
	private ProjectCode projectCode;

	public ProjectNumber() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProjectEndDate() {
		return this.projectEndDate;
	}

	public void setProjectEndDate(String projectEndDate) {
		this.projectEndDate = projectEndDate;
	}

	public String getProjectNo() {
		return this.projectNo;
	}

	public void setProjectNo(String projectNo) {
		this.projectNo = projectNo;
	}

	public String getProjectStartDate() {
		return this.projectStartDate;
	}

	public void setProjectStartDate(String projectStartDate) {
		this.projectStartDate = projectStartDate;
	}

	public ProjectCode getProjectCode() {
		return this.projectCode;
	}

	public void setProjectCode(ProjectCode projectCode) {
		this.projectCode = projectCode;
	}

}