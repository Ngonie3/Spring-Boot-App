/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ngonie.springbootApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ngonie.springbootApp.model.user;
import org.springframework.stereotype.Repository;
/**
 *
 * @author ngoni
 */
@Repository
public interface UserRepository extends JpaRepository<user, Long>{
    user findByEmail(String email);
}
