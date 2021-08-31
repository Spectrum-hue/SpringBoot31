package com.aspringbootnow31.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aspringbootnow31.model.Favourites;

public interface FavouriteRepository extends JpaRepository<Favourites, Integer> {

	Favourites save(Favourites favourites);
	
}
