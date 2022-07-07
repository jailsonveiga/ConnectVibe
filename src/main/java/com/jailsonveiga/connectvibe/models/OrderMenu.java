package com.jailsonveiga.connectvibe.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;

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
    @JoinColumn(name = "restaurant_id", referencedColumnName = "restaurantId")
    @JsonIgnoreProperties("restaurantId")
    private Restaurant creator;



}
