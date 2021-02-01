/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.ecommerce.controller;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author PodeumINC
 */
@RequestMapping("ecommerce")
@RestController
public class ProductController {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(ProductController.class);

    @GetMapping("test")
    public String getTest() {
        return "ecommerce Project is running ";
    }

}
