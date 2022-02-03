/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ngonie.springbootApp.controller;

import com.ngonie.springbootApp.model.Contact;
import com.ngonie.springbootApp.repository.ContactListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 *
 * @author ngoni
 */
@Controller
public class EmergencyContact {
    
    @Autowired
    ContactListRepository repo;
    
    @GetMapping("/emergencyContact")
    public String showContactForm(Model model){
        Contact contact = new Contact();
        model.addAttribute("contact", contact);
        return "contact_form";
    }
    
    @PostMapping("/emergencyContact")
    public String submitDetails(@ModelAttribute("contact") Contact contact){
        repo.save(contact);
        return "details_submitted";
    }
    
    /*@RequestMapping("/emergencyContact")
    @ResponseBody
    public String saveData(Contact contact){
        repo.save(contact);
        return"details_submitted";
    }*/
}
