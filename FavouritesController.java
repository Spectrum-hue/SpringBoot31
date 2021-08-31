package com.aspringbootnow31.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aspringbootnow31.model.Favourites;
import com.aspringbootnow31.repository.FavouriteRepository;
// Mapping and creating rest API
@RestController
public class FavouritesController {

    @Autowired
    private FavouriteRepository repository;

    @RequestMapping(value="/favourites",method=RequestMethod.GET)
    public List<Favourites> getFavourites(){

        return repository.findAll();
    }

  

    @RequestMapping(value="/favourites/",method=RequestMethod.POST)
    public Favourites createFavourites(@RequestBody Favourites favourites) {

        return repository.save(favourites);
    }


    
}





