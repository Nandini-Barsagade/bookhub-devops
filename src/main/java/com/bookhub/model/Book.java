package com.bookhub.model;
import jakarta.persistence.*;
@Entity
public class Book {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String title;
private double price;
public Book() {}
public Book(String title,double price){
this.title=title;
this.price=price;
}
public int getId(){return id;}
public void setId(int id){this.id=id;}
public String getTitle(){return title;}
public void setTitle(String title){this.title=title;}
public double getPrice(){return price;}
public void setPrice(double price){this.price=price;}
}