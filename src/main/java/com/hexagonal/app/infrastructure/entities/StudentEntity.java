package com.hexagonal.app.infrastructure.entities;

import com.hexagonal.app.domain.model.Student;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idStudent;
	private char grade;
	private char group;
	private String name;
	private String phoneNumber;
	private String email;

	public StudentEntity(int idStudent, char grade, char group, String name, String phoneNumber, String email) {
		super();
		this.idStudent = idStudent;
		this.grade = grade;
		this.group = group;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public StudentEntity() {

	}

	public static StudentEntity fromDomainModel(Student student) {
		return new StudentEntity(student.getIdStudent(), student.getGrade(), student.getGroup(), student.getName(),
				student.getPhoneNumber(), student.getEmail());
	}
	
	public Student toDomainModel() {
		return new Student(idStudent, grade, group, name, phoneNumber, email);
	}
	
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

}
