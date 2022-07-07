package com.jailsonveiga.connectvibe.repositories;

import com.jailsonveiga.connectvibe.models.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
}
