package com.jailsonveiga.connectvibe.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
public class OrderMenu {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderMenuId;
    private String orderMenuItem;
    private String orderMenuDescription;
    private Integer orderMenuQuantity;
    //private orderMenuImage;
    private Float orderMenuPrice;

    @ManyToOne
    @JoinColumn(name = "Restaurant_id", referencedColumnName = "restaurantId")
    @JsonIgnoreProperties("restaurantId")
    private Restaurant restaurant;

    public OrderMenu() {
    }

    //Constructor
    public OrderMenu(Long orderMenuId, String orderMenuItem, String orderMenuDescription, Integer orderMenuQuantity, Float orderMenuPrice, Restaurant restaurant) {
        this.orderMenuId = orderMenuId;
        this.orderMenuItem = orderMenuItem;
        this.orderMenuDescription = orderMenuDescription;
        this.orderMenuQuantity = orderMenuQuantity;
        this.orderMenuPrice = orderMenuPrice;
        this.restaurant = restaurant;
    }

    //Getter and Setter
    public Long getOrderMenuId() {
        return orderMenuId;
    }

    public void setOrderMenuId(Long orderMenuId) {
        this.orderMenuId = orderMenuId;
    }

    public String getOrderMenuItem() {
        return orderMenuItem;
    }

    public void setOrderMenuItem(String orderMenuItem) {
        this.orderMenuItem = orderMenuItem;
    }

    public String getOrderMenuDescription() {
        return orderMenuDescription;
    }

    public void setOrderMenuDescription(String orderMenuDescription) {
        this.orderMenuDescription = orderMenuDescription;
    }

    public Integer getOrderMenuQuantity() {
        return orderMenuQuantity;
    }

    public void setOrderMenuQuantity(Integer orderMenuQuantity) {
        this.orderMenuQuantity = orderMenuQuantity;
    }

    public Float getOrderMenuPrice() {
        return orderMenuPrice;
    }

    public void setOrderMenuPrice(Float orderMenuPrice) {
        this.orderMenuPrice = orderMenuPrice;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
}
