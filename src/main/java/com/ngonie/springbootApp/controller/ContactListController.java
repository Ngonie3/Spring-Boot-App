/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ngonie.springbootApp.controller;

import com.ngonie.springbootApp.model.contactList;
import com.ngonie.springbootApp.service.ContactListService;
import com.ngonie.springbootApp.web.dto.contactListDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



/**
 *
 * @author ngoni
 */

@Controller
@RequestMapping(value="contactList", method=RequestMethod.POST)
public class ContactListController {
    
    private ContactListService contactListService;
    
    public ContactListController() {
    }
    
    @GetMapping
    public String showEmergencyContactList(){ 
        return "contactList";
    }
    
    @PostMapping("/saveEmergencyContact")
    public String updateContactList(@ModelAttribute("contact_list") contactList contacList){
        contactListService.saveEmergencyContact(contacList);
        return "new_emergency_contact";
    }
    
    @ModelAttribute("contactList")
    public contactListDto contListDto(){
        return new contactListDto();
    }   
}
