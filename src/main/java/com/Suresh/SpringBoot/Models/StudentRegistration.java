package com.Suresh.SpringBoot.Models;

import java.util.Arrays;

public class StudentRegistration {

	private String name;
	private String email;
	private Long phno;
	private String gender;
	private String course;
	private String[] timings; 

	public StudentRegistration() {
		// TODO Auto-generated constructor stub
	}

	public StudentRegistration(String name, String email, Long phno, String gender, String course, String[] timings) {
		super();
		this.name = name;
		this.email = email;
		this.phno = phno;
		this.gender = gender;
		this.course = course;
		this.timings = timings;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhno() {
		return phno;
	}

	public void setPhno(Long phno) {
		this.phno = phno;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String[] getTimings() {
		return timings;
	}

	public void setTimings(String[] timings) {
		this.timings = timings;
	}

	@Override
	public String toString() {
		return "StudentRegistration [name=" + name + ", email=" + email + ", phno=" + phno + ", gender=" + gender
				+ ", course=" + course + ", timings=" + Arrays.toString(timings) + ", getName()=" + getName()
				+ ", getEmail()=" + getEmail() + ", getPhno()=" + getPhno() + ", getGender()=" + getGender()
				+ ", getCourse()=" + getCourse() + ", getTimings()=" + Arrays.toString(getTimings()) + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
 

}
