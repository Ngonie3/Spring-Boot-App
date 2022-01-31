/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ngonie.springbootApp.service;

import com.ngonie.springbootApp.model.contactList;
import com.ngonie.springbootApp.repository.ContactListRepository;
import com.ngonie.springbootApp.web.dto.contactListDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 *
 * @author ngoni
 */
public class ContactListImpl implements ContactListService{
    
    @Autowired
    private ContactListRepository contactListRepository;

    public ContactListImpl(ContactListRepository contactListRepository) {
        this.contactListRepository = contactListRepository;
    }

    @Override
    public contactList save(contactListDto listDto) {
      //To change body of generated methods, choose Tools | Templates.
      contactList contList = new contactList(listDto.getEmployeeName(), listDto.getNextOfKin(), listDto.getPhoneNumber(), listDto.getAddress());
      return contactListRepository.save(contList);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }  

    @Override
    public void saveEmergencyContact(contactList contacList) {
     //To change body of generated methods, choose Tools | Templates.
     this.contactListRepository.save(contacList);
    }
}
