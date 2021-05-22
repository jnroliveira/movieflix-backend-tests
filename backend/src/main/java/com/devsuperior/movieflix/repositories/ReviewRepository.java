package com.devsuperior.movieflix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.movieflix.entities.Review;
import com.devsuperior.movieflix.entities.pk.ReviewPK;

public interface ReviewRepository extends JpaRepository<Review, ReviewPK>{

}
