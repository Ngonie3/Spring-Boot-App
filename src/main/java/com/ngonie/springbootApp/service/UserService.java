/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ngonie.springbootApp.service;

import com.ngonie.springbootApp.model.user;
import com.ngonie.springbootApp.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 *
 * @author ngoni
 */
public interface UserService extends UserDetailsService{
    user save(UserRegistrationDto registrationDto);
}
