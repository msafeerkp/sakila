package org.sakila.data.models;

import java.io.Serializable;
import java.util.Date;

public class Country implements Serializable{
	
	private static final long serialVersionUID = 2319320572779812937L;
	
	private long countryId;
	private String country;
	private Date lastUpdate;
	
	public long getCountryId() {
		return countryId;
	}
	public void setCountryId(long countryId) {
		this.countryId = countryId;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Date getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
}
