package com.examly.springapp.Repo;

import com.examly.springapp.Entity.CustmLogin_Enty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@EnableJpaRepositories
@Repository
public interface CustmLoginRepo extends JpaRepository<CustmLogin_Enty,Integer>
{
    Optional<CustmLogin_Enty> findOneByEmailAndPassword(String email, String password);
    CustmLogin_Enty findByEmail(String email);
}