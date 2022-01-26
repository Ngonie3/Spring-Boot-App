/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ngonie.springbootApp.controller;

import com.ngonie.springbootApp.service.ContactListService;
import com.ngonie.springbootApp.web.dto.contactListDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 *
 * @author ngoni
 */

@Controller
@RequestMapping("/contactList")
public class ContactListController {
    
    private ContactListService contactListService;

    public ContactListController(ContactListService contactListService) {
        this.contactListService = contactListService;
    }

    public ContactListController() {
    }
    
    @ModelAttribute("contactList")
    public contactListDto contListDto(){
        return new contactListDto();
    }
    
    @GetMapping
    public String showEmergencyContactList(){ 
        return "contactList";
    }
    
    @PostMapping
    public String updateContactList (@ModelAttribute("contactList") contactListDto contListDto){
        contactListService.save(contListDto);
        return"redirect:/contactList?success";
    }
}
