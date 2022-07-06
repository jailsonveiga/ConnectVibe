package com.jailsonveiga.connectvibe.repositories;

import com.jailsonveiga.connectvibe.models.Waitress;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//Interface is like a contract, any class that implement interface will build the class for us
public interface WaitressRepository extends JpaRepository<Waitress, Long> {
//    List<Waitress> findAllByName(String waitressName);
}
