package com.mongodb.ms0.example.springdata.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Phone {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String type;
    private String number;
    private String countryPrefix;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCountryPrefix() {
        return countryPrefix;
    }

    public void setCountryPrefix(String countryPrefix) {
        this.countryPrefix = countryPrefix;
    }
}
