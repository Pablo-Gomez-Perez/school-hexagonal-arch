package com.hexagonal.app.domain.model;

public class Teacher {

	private int idTeacher;
	private String name;
	private String DNI;
	private String phoneNumber;
	private String email;	

	public Teacher(int idTeacher, String name, String dNI, String phoneNumber, String email) {
		super();
		this.idTeacher = idTeacher;
		this.name = name;
		DNI = dNI;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public int getIdTeacher() {
		return idTeacher;
	}

	public void setIdTeacher(int idTeacher) {
		this.idTeacher = idTeacher;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
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
	
	

}
