package org.sakila.data.models;

import java.io.Serializable;
import java.util.Date;

public class Actor implements Serializable{
	
	private static final long serialVersionUID = -8414416914239751451L;
	
	private long actorId;
	private String firstName;
	private String lastName;
	private Date lastUpdate;
	
	public long getActorId() {
		return actorId;
	}
	public void setActorId(long actorId) {
		this.actorId = actorId;
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
	public Date getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	
	

}
