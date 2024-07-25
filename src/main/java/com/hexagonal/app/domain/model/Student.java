package com.hexagonal.app.domain.model;

public class Student {
	
	 private int idStudent;
	 private char grade;
	 private char group;
	 private String name;
	 private String phoneNumber;
	 private String email;
	 
	public Student(int idStudent, char grade, char group, String name, String phoneNumber, String email) {
		super();
		this.idStudent = idStudent;
		this.grade = grade;
		this.group = group;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	public Student() {}

	public int getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public char getGroup() {
		return group;
	}

	public void setGroup(char group) {
		this.group = group;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [idStudent=" + idStudent + ", grade=" + grade + ", group=" + group + ", name=" + name
				+ ", phoneNumber=" + phoneNumber + ", email=" + email + "]";
	}
	
	
	 
}
