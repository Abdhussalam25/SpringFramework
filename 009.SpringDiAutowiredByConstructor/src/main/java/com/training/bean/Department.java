package com.training.bean;
public class Department {
	private String deptName;
	private String deptLocation;
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptLocation() {
		return deptLocation;
	}
	public void setDeptLocation(String deptLocation) {
		this.deptLocation = deptLocation;
	}
	public Department() {

	}
	public Department(String deptName, String deptLocation) {
		super();
		this.deptName = deptName;
		this.deptLocation = deptLocation;
	}
	@Override
	public String toString() {
		return "\nDepartment=>deptName=" + deptName + ", deptLocation=" + deptLocation;
	}
	
	

}
