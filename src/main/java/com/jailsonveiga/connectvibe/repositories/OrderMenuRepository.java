package com.jailsonveiga.connectvibe.repositories;

import com.jailsonveiga.connectvibe.models.OrderMenu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderMenuRepository extends JpaRepository<OrderMenu, Long> {

    List<OrderMenu> findAllByRestaurant_restaurantId(Long restaurantId);
}
