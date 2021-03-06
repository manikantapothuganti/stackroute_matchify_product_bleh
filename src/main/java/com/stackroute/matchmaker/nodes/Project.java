package com.stackroute.matchmaker.nodes;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Project {
	@Id
	private String projectId;
	private String projectTitle;
	private String projectAt;
	private String department;
	private String projectLocation;

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(String projectId, String projectTitle, String projectAt, String department, String projectLocation) {
		super();
		this.projectId = projectId;
		this.projectTitle = projectTitle;
		this.projectAt = projectAt;

		this.department = department;
		this.projectLocation = projectLocation;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getProjectTitle() {
		return projectTitle;
	}

	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}

	public String getProjectAt() {
		return projectAt;
	}

	public void setProjectAt(String projectAt) {
		this.projectAt = projectAt;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getProjectLocation() {
		return projectLocation;
	}

	public void setProjectLocation(String projectLocation) {
		this.projectLocation = projectLocation;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectTitle=" + projectTitle + ", projectAt=" + projectAt
				+ ", department=" + department + ", projectLocation=" + projectLocation + "]";
	}

}
