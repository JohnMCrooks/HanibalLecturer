/*
 * Copyright (c) 2016.
 */

package com.crooks.controllers;

import com.crooks.entities.Lecturer;
import com.crooks.entities.Review;
import com.crooks.services.LecturerRepository;
import com.crooks.services.ReviewRepository;
import org.h2.tools.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpSession;
import java.sql.SQLException;

/**
 * Created by johncrooks on 6/30/16.
 */
@Controller
public class HannibalController {

    @Autowired
    LecturerRepository lectRepo;

    @Autowired
    ReviewRepository reviewRepo;

    @PostConstruct
    public void init() throws SQLException{
        Server.createWebServer().start();
    }

    @RequestMapping(path="/lecturers", method = RequestMethod.POST)
    public String addlect(String name, String topic, String image){
        Lecturer lecturer = new Lecturer(name, topic, image);
        lectRepo.save(lecturer);

    return "redirect:/";
    }


    @RequestMapping(path="/reviews", method = RequestMethod.POST)
    public String addReview(Integer id, String author, String text, Integer lecturerId, Boolean isGood){
        Lecturer lecturer = lectRepo.findOne(lecturerId);
        Review review = new Review(author, text, isGood, lecturer);
        reviewRepo.save(review);


        return "redirect:/";
    }




} // End of  HanHannibalController
