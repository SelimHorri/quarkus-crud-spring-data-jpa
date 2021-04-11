package com.selimhorri.pack.model.dto;

public class EmployeeDto {
	
	private Integer id;
	private String fname;
	private String lname;
	private String email;
	private String imageUrl;
	private String hiredate;
	private String username;
	private String password;
	
	public EmployeeDto() {
		
	}
	
	public EmployeeDto(String fname, String lname, String email, String imageUrl, String hiredate, String username, String password) {
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.imageUrl = imageUrl;
		this.hiredate = hiredate;
		this.username = username;
		this.password = password;
	}
	
	public EmployeeDto(Integer id, String fname, String lname, String email, String imageUrl, String hiredate, String username, String password) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.imageUrl = imageUrl;
		this.hiredate = hiredate;
		this.username = username;
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "EmployeeDto [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", imageUrl="
				+ imageUrl + ", hiredate=" + hiredate + ", username=" + username + ", password=" + password + "]";
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getFname() {
		return fname;
	}
	
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public String getLname() {
		return lname;
	}
	
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getImageUrl() {
		return imageUrl;
	}
	
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	public String getHiredate() {
		return hiredate;
	}
	
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}





