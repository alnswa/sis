package com.spaneos.sis.domain;

public class Student {

	private int studentId;
	private String fullName;
	private String batchNo;
	private String email;
	private String qualification;
	private String college;
	private double percentage;
	private String branch;
	private String city;
	private String state;

	public Student() {
		super();
	}

	public Student(int studentId, String fullName, String batchNo,
			String email, String qualification, String college,
			double percentage, String branch, String city, String state) {
		this.studentId = studentId;
		this.fullName = fullName;
		this.batchNo = batchNo;
		this.email = email;
		this.qualification = qualification;
		this.college = college;
		this.percentage = percentage;
		this.branch = branch;
		this.city = city;
		this.state = state;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", fullName=" + fullName
				+ ", batchNo=" + batchNo + ", email=" + email
				+ ", qualification=" + qualification + ", college=" + college
				+ ", percentage=" + percentage + ", branch=" + branch
				+ ", city=" + city + ", state=" + state + "]";
	}

}
