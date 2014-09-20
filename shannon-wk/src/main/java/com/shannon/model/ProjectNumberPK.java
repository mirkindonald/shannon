package com.shannon.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the project_number database table.
 * 
 */
@Embeddable
public class ProjectNumberPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="project_code_id")
	private String projectCodeId;

	@Column(name="project_no")
	private String projectNo;

	public ProjectNumberPK() {
	}
	public String getProjectCodeId() {
		return this.projectCodeId;
	}
	public void setProjectCodeId(String projectCodeId) {
		this.projectCodeId = projectCodeId;
	}
	public String getProjectNo() {
		return this.projectNo;
	}
	public void setProjectNo(String projectNo) {
		this.projectNo = projectNo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ProjectNumberPK)) {
			return false;
		}
		ProjectNumberPK castOther = (ProjectNumberPK)other;
		return 
			this.projectCodeId.equals(castOther.projectCodeId)
			&& this.projectNo.equals(castOther.projectNo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.projectCodeId.hashCode();
		hash = hash * prime + this.projectNo.hashCode();
		
		return hash;
	}
}