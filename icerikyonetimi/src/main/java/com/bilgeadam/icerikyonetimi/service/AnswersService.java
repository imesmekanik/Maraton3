/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bilgeadam.icerikyonetimi.service;

import com.bilgeadam.icerikyonetimi.repository.AnswersRepository;
import com.bilgeadam.icerikyonetimi.repository.entity.Answers;
import com.bilgeadam.icerikyonetimi.utility.MyFactoryService;

/**
 *
 * @author MONSTER
 */
public class AnswersService extends MyFactoryService<AnswersRepository, Answers, Long> {

    public AnswersService() {
        super(new AnswersRepository());
    }
    
}