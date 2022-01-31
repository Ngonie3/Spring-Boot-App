/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ngonie.springbootApp.service;

import com.ngonie.springbootApp.model.contactList;
import com.ngonie.springbootApp.web.dto.contactListDto;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 *
 * @author ngoni
 */
public interface ContactListService extends UserDetailsService{
    contactList save(contactListDto listDto);
    void saveEmergencyContact(contactList contacList);
}
