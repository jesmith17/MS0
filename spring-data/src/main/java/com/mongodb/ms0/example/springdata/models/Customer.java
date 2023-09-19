package com.mongodb.ms0.example.springdata.models;

import jakarta.persistence.*;
import org.bson.types.ObjectId;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;

/*
We are explictly defining a value for the document annotation here because the collection is named differently than Spring-data's default. Spring assumes class name and collection name are the same. So the use of the plular for Customer requires this correction
 */
@Document("customers")
@Entity
public class Customer {

    @MongoId
    private ObjectId _id;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    private String title;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="customerId")
    private Address address;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="customerId")
    private List<Phone> phones;


    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }
}
