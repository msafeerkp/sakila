package org.sakila;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "test")
public class Test implements Serializable {
	
	private static final long serialVersionUID = -7904328472214778873L;

	@Id
	private int idtest;
	private String testcol1;

	public int getIdtest() {
		return idtest;
	}

	public void setIdtest(int idtest) {
		this.idtest = idtest;
	}

	public String getTestcol1() {
		return testcol1;
	}

	public void setTestcol1(String testcol1) {
		this.testcol1 = testcol1;
	}

}
