/*
 * Copyright (c) 2016.
 */

package com.crooks.entities;

import javax.persistence.*;

/**
 * Created by johncrooks on 6/30/16.
 */
@Entity
@Table(name = "reviews")
public class Review {
    @Id
    @GeneratedValue
    int id;

    @Column
    String author;

    @Column(nullable = false)
    String text;


    @Column(nullable = false)
    boolean isGood;

    @ManyToOne
    Lecturer lecturer;

    public Review(String author, String text, boolean isGood, Lecturer lecturer) {
        this.author = author;
        this.text = text;
        this.isGood = isGood;
        this.lecturer = lecturer;
    }

    public Review(String author, String text, boolean isGood) {
        this.author = author;
        this.text = text;
        this.isGood = isGood;
    }

    public Review() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isGood() {
        return isGood;
    }

    public void setGood(boolean good) {
        isGood = good;
    }
}
