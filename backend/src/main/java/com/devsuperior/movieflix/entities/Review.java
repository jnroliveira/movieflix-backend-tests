package com.devsuperior.movieflix.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.devsuperior.movieflix.entities.pk.ReviewPK;

@Entity
@Table(name = "tb_review")
public class Review implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ReviewPK id = new ReviewPK();
	private String text;

	public Review() {

	}

	public Review(User user, Movie movie, String text) {
		id.setUser(user);
		id.setMovie(movie);
		this.text = text;
	}

	public User getUser() {
		return id.getUser();
	}

	public void setUser(User user) {
		id.setUser(user);
	}

	public Movie getMovie() {
		return id.getMovie();
	}

	public void setMovie(Movie movie) {
		id.setMovie(movie);
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
