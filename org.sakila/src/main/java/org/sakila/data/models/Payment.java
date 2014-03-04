package org.sakila.data.models;

import java.io.Serializable;
import java.util.Date;

public class Payment implements Serializable{
	
	private static final long serialVersionUID = -6799379873803793738L;
	
	private long paymentId;
	private double amount;
	private Date paymentDate;
	private Date lastUpdate;
	private long customerId;
	private long staffId;
	private long rentalId;
	public long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public Date getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public long getStaffId() {
		return staffId;
	}
	public void setStaffId(long staffId) {
		this.staffId = staffId;
	}
	public long getRentalId() {
		return rentalId;
	}
	public void setRentalId(long rentalId) {
		this.rentalId = rentalId;
	}

}
