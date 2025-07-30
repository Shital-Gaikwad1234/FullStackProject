package com.intellismart.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "FieldUser")
public class FieldUser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int Id;
	
	private String name;
	
	private long Mobile_Number;
	
	private String Email_Id;
	
	private String Role;
	
	private String Contractor ;
	
	private String subdivision;
	
	private String password;
	
	public FieldUser() {
		// TODO Auto-generated constructor stub
		super();
	}

	public FieldUser(int id, String name, long mobile_Number, String email_Id, String role, String contractor,
			String subdivision, String password) {
		super();
		Id = id;
		this.name = name;
		Mobile_Number = mobile_Number;
		Email_Id = email_Id;
		Role = role;
		Contractor = contractor;
		this.subdivision = subdivision;
		this.password = password;
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

	public long getMobile_Number() {
		return Mobile_Number;
	}

	public void setMobile_Number(long mobile_Number) {
		Mobile_Number = mobile_Number;
	}

	public String getEmail_Id() {
		return Email_Id;
	}

	public void setEmail_Id(String email_Id) {
		Email_Id = email_Id;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}

	public String getContractor() {
		return Contractor;
	}

	public void setContractor(String contractor) {
		Contractor = contractor;
	}

	public String getSubdivision() {
		return subdivision;
	}

	public void setSubdivision(String subdivision) {
		this.subdivision = subdivision;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "FieldUser [Id=" + Id + ", name=" + name + ", Mobile_Number=" + Mobile_Number + ", Email_Id=" + Email_Id
				+ ", Role=" + Role + ", Contractor=" + Contractor + ", subdivision=" + subdivision + ", password="
				+ password + "]";
	}
	
	
	
	
	
	
}
