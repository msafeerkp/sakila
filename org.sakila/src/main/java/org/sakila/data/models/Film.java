package org.sakila.data.models;

import java.sql.Clob;
import java.util.Date;

public class Film {
	private long filmId;
	private String title;
	private Clob description;
	private String releaseYear;
	private long rentalDuration;
	private float rentalRate;
	private long length;
	private float replacementCost;
	private String rating;
	private String specialFeatures;
	private Date lastUpdate;
	private long languageId;
	private long originalLanguageId;
	public long getFilmId() {
		return filmId;
	}
	public void setFilmId(long filmId) {
		this.filmId = filmId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Clob getDescription() {
		return description;
	}
	public void setDescription(Clob description) {
		this.description = description;
	}
	public String getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}
	public long getRentalDuration() {
		return rentalDuration;
	}
	public void setRentalDuration(long rentalDuration) {
		this.rentalDuration = rentalDuration;
	}
	public float getRentalRate() {
		return rentalRate;
	}
	public void setRentalRate(float rentalRate) {
		this.rentalRate = rentalRate;
	}
	public long getLength() {
		return length;
	}
	public void setLength(long length) {
		this.length = length;
	}
	public float getReplacementCost() {
		return replacementCost;
	}
	public void setReplacementCost(float replacementCost) {
		this.replacementCost = replacementCost;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getSpecialFeatures() {
		return specialFeatures;
	}
	public void setSpecialFeatures(String specialFeatures) {
		this.specialFeatures = specialFeatures;
	}
	public Date getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	public long getLanguageId() {
		return languageId;
	}
	public void setLanguageId(long languageId) {
		this.languageId = languageId;
	}
	public long getOriginalLanguageId() {
		return originalLanguageId;
	}
	public void setOriginalLanguageId(long originalLanguageId) {
		this.originalLanguageId = originalLanguageId;
	}
	
}
