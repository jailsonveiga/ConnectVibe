package com.jailsonveiga.connectvibe.models;


import javax.persistence.*;
import java.util.Set;

@Entity
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long restaurantId;
    private String restaurantName;
    private String restaurantAddress;
    private String restaurantPhone;

    @OneToMany(mappedBy = "restaurant", fetch = FetchType.LAZY)
    private Set<OrderMenu> ordermenus;

    //Default Constructor

    public Restaurant() {
    }

    //Constructor
    public Restaurant(Long restaurantId, String restaurantName, String restaurantAddress, String restaurantPhone) {
        this.restaurantId = restaurantId;
        this.restaurantName = restaurantName;
        this.restaurantAddress = restaurantAddress;
        this.restaurantPhone = restaurantPhone;
    }

    //Getter and Setter
    public Set<OrderMenu> getOrdermenus() {
        return ordermenus;
    }

    public void setOrdermenus(Set<OrderMenu> ordermenus) {
        this.ordermenus = ordermenus;
    }

    public Long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public String getRestaurantPhone() {
        return restaurantPhone;
    }

    public void setRestaurantPhone(String restaurantPhone) {
        this.restaurantPhone = restaurantPhone;
    }
}
