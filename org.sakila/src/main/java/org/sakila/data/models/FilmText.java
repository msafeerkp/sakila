package org.sakila.data.models;

import java.io.Serializable;
import java.sql.Clob;

public class FilmText implements Serializable{
	
	private static final long serialVersionUID = -2989537217592957129L;
	
	private long filmId;
	private String title;
	private Clob description;
	
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
	
}
