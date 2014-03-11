package org.sakila.data.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STORE")
public class Store implements Serializable{
	
	private static final long serialVersionUID = -3223136346567825555L;
	
	@Id
	private long storeId;
	private Date lastUpdate;
	private long managerStaffId;
	private long addressId;
	
	public long getStoreId() {
		return storeId;
	}
	public void setStoreId(long storeId) {
		this.storeId = storeId;
	}
	public Date getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	public long getManagerStaffId() {
		return managerStaffId;
	}
	public void setManagerStaffId(long managerStaffId) {
		this.managerStaffId = managerStaffId;
	}
	public long getAddressId() {
		return addressId;
	}
	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}
	
}
