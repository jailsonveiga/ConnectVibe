package com.jailsonveiga.connectvibe.repositories;

import com.jailsonveiga.connectvibe.models.Waitress;
import org.springframework.data.jpa.repository.JpaRepository;

//Interface is like a contract, any class that implement interface will build the class for us
public interface WaitressRepository extends JpaRepository<Waitress, Long> {
}
