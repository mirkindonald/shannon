package com.shannon.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the project_code database table.
 * 
 */
@Entity
@Table(name="project_code")
@NamedQuery(name="ProjectCode.findAll", query="SELECT p FROM ProjectCode p")
public class ProjectCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="project_code_id")
	private String projectCodeId;

	@Column(name="project_code_description")
	private String projectCodeDescription;

	//bi-directional many-to-one association to ProjectNumber
	@OneToMany(mappedBy="projectCode")
	private List<ProjectNumber> projectNumbers;

	public ProjectCode() {
	}

	public String getProjectCodeId() {
		return this.projectCodeId;
	}

	public void setProjectCodeId(String projectCodeId) {
		this.projectCodeId = projectCodeId;
	}

	public String getProjectCodeDescription() {
		return this.projectCodeDescription;
	}

	public void setProjectCodeDescription(String projectCodeDescription) {
		this.projectCodeDescription = projectCodeDescription;
	}

	public List<ProjectNumber> getProjectNumbers() {
		return this.projectNumbers;
	}

	public void setProjectNumbers(List<ProjectNumber> projectNumbers) {
		this.projectNumbers = projectNumbers;
	}

	public ProjectNumber addProjectNumber(ProjectNumber projectNumber) {
		getProjectNumbers().add(projectNumber);
		projectNumber.setProjectCode(this);

		return projectNumber;
	}

	public ProjectNumber removeProjectNumber(ProjectNumber projectNumber) {
		getProjectNumbers().remove(projectNumber);
		projectNumber.setProjectCode(null);

		return projectNumber;
	}

}