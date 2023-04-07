package net.javaguides.springboot.model;

import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email_id")
	private String emailId;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "company")
	private String company;
	
	@Column(name = "experience")
	private String experience;
	
	public Employee() {
		
	}
	
//	public Employee(String firstName, String lastName, String emailId) {
//		super();
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.emailId = emailId;
//	}
	
	
	public long getId() {
		return id;
	}
	public Employee(String firstName, String lastName, String emailId, String city, String company, String experience) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.emailId = emailId;
	this.city = city;
	this.company = company;
	this.experience = experience;
}

	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}
	
	
}
