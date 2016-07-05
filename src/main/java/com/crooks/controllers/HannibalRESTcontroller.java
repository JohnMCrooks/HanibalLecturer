/*
 * Copyright (c) 2016.
 */

package com.crooks.controllers;

/**
 * Created by johncrooks on 6/30/16.
 */

import com.crooks.entities.Lecturer;
import com.crooks.entities.Review;
import com.crooks.services.LecturerRepository;
import com.crooks.services.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HannibalRESTcontroller {
    @Autowired
    LecturerRepository lectRepo;

    @Autowired
    ReviewRepository reviewRepo;

    @RequestMapping(path="/lecturers", method = RequestMethod.GET)
    public Iterable<Lecturer> getLect(Model model, Integer id, String name, String topic, String image){
        model.addAttribute("lecturer", lectRepo);
        return lectRepo.findAll();
    }

    @RequestMapping(path="/reviews", method = RequestMethod.GET)
    public Iterable<Review> getReviews( Integer id, String author, String text, Integer lecturerId, boolean isGood){
        //Lecturer lecture = lectRepo.findOne(lecturerId);
        return reviewRepo.findByLecturerId(lecturerId);
    }




}  //END REST_Controller


