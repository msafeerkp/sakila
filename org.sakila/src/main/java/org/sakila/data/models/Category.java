package org.sakila.data.models;

import java.io.Serializable;
import java.util.Date;

public class Category implements Serializable{
	
	private static final long serialVersionUID = -5924715674112641288L;
	
	private long categoryId;
	private String name;
	private Date lastUpdate;
	
	public long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	
	

}
