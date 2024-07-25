package com.hexagonal.app.infrastructure.entities;

import java.time.LocalDateTime;

import com.hexagonal.app.domain.model.Teacher;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.GenerationType;

@Entity
public class TeacherEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String name;
	private String DNI;
	private String phoneNumber;
	private String email;
	private LocalDateTime creationDate;

	public TeacherEntity(int id, String name, String dNI, String phoneNumber, String email,
			LocalDateTime creationDate) {
		super();
		Id = id;
		this.name = name;
		DNI = dNI;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.creationDate = creationDate;
	}

	public TeacherEntity() {
		super();
	}

	public static TeacherEntity fromDomainModel(Teacher teacher) {
		return new TeacherEntity(teacher.getIdTeacher(), teacher.getDNI(), teacher.getPhoneNumber(), teacher.getEmail(),
				teacher.getEmail(), LocalDateTime.now());
	}
	
	public Teacher toDomainModel() {
		return new Teacher(Id, name, DNI, phoneNumber, email);
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
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

	public LocalDateTime getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}
	
	

}
