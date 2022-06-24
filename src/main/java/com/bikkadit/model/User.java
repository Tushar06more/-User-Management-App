package com.bikkadit.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "USER_DETAILS")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID")
	private int userId;
	@Column(name = "FIRST_NAME")
	private String userfirstName;
	@Column(name = "LAST_NAME")
	private String userlastName;
	@Column(name = "USER_EMAIL")
	private String useremail;
	@Column(name = "USER_PHNO")
	private String userphNo;
	@Column(name = "PASSWORD")
	private String password;
	
	@Column(name = "CREATED_DATE", updatable = false)
	@CreationTimestamp
	private LocalDate createdDate;
	@Column(name = "UPDATED_DATE", insertable = false)
	@CreationTimestamp
	private LocalDate updatedDate;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserfirstName() {
		return userfirstName;
	}
	public void setUserfirstName(String userfirstName) {
		this.userfirstName = userfirstName;
	}
	public String getUserlastName() {
		return userlastName;
	}
	public void setUserlastName(String userlastName) {
		this.userlastName = userlastName;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public String getUserphNo() {
		return userphNo;
	}
	public void setUserphNo(String userphNo) {
		this.userphNo = userphNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	public LocalDate getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}
	public User(int userId, String userfirstName, String userlastName, String useremail, String userphNo,
			String password, LocalDate createdDate, LocalDate updatedDate) {
		super();
		this.userId = userId;
		this.userfirstName = userfirstName;
		this.userlastName = userlastName;
		this.useremail = useremail;
		this.userphNo = userphNo;
		this.password = password;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}
	
	
	
	
}
