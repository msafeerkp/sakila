package org.sakila.data.models;

import java.io.Serializable;
import java.util.Date;

public class Inventory implements Serializable{

	private static final long serialVersionUID = -4805995683635383524L;
	
	private long inventoryId;
	private Date lastUpdate;
	private long filmId;
	private long storeId;
	
	public long getInventoryId() {
		return inventoryId;
	}
	public void setInventoryId(long inventoryId) {
		this.inventoryId = inventoryId;
	}
	public Date getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	public long getFilmId() {
		return filmId;
	}
	public void setFilmId(long filmId) {
		this.filmId = filmId;
	}
	public long getStoreId() {
		return storeId;
	}
	public void setStoreId(long storeId) {
		this.storeId = storeId;
	}
	
}
