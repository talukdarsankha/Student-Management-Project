package com.entity;

public class Student {

	private int id;
	private String name;
	private String date;
	private String qualification;
	private String address;
	private String email;
	private String password;
	
	

	public Student() {
		
	}
	
	public Student(String name, String date, String qualification, String address, String email, String password) {
		super();
		this.name = name;
		this.date = date;
		this.qualification = qualification;
		this.address = address;
		this.email = email;
		this.password = password;
	}

	public Student(int id, String name, String date, String qualification, String address, String email,
			String password) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.qualification = qualification;
		this.address = address;
		this.email = email;
		this.password = password;
	}
	







	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getQualification() {
		return qualification;
	}


	public void setQualification(String qualification) {
		this.qualification = qualification;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
