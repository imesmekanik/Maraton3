/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bilgeadam.icerikyonetimi.service;

import com.bilgeadam.icerikyonetimi.repository.UserRepository;
import com.bilgeadam.icerikyonetimi.repository.entity.User;
import com.bilgeadam.icerikyonetimi.utility.MyFactoryService;

/**
 *
 * @author MONSTER
 */
public class UserService extends MyFactoryService<UserRepository, User, Long> {

    public UserService() {
        super(new UserRepository());
    }
    
}