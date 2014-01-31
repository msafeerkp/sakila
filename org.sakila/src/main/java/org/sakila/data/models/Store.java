package org.sakila.data.models;

import java.util.Date;

public class Store {
	
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
