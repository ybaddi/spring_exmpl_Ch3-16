package com.springExmpl.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable, Comparable<User> {
	
	
	private String login;
	
	private String password;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private Date creationDate;

    private Date lastAccessDate;

    private boolean enabled;

    private String dateFormat;
    
    

	public String getLogin() {
		return login;
	}



	public void setLogin(String login) {
		this.login = login;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
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



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public Date getCreationDate() {
		return creationDate;
	}



	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}



	public Date getLastAccessDate() {
		return lastAccessDate;
	}



	public void setLastAccessDate(Date lastAccessDate) {
		this.lastAccessDate = lastAccessDate;
	}



	public boolean isEnabled() {
		return enabled;
	}



	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}



	public String getDateFormat() {
		return dateFormat;
	}



	public void setDateFormat(String dateFormat) {
		this.dateFormat = dateFormat;
	}



	@Override
	public int compareTo(User that) {
		return this.getLogin().compareTo(that.getLogin());
	}

}
