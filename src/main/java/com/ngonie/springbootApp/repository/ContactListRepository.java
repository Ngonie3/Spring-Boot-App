/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ngonie.springbootApp.repository;

import org.springframework.stereotype.Repository;
import com.ngonie.springbootApp.model.contactList;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ngoni
 */
@Repository
public interface ContactListRepository extends JpaRepository<contactList, Character>{
    
}
