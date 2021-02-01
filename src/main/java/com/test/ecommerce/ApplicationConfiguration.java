/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.ecommerce;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 *
 * @author johnson3yo
 */
@Configuration
@ComponentScan({"com.test.ecommerce"})
@PropertySource(value = {"file:/var/config/ecommerce/application.properties"})
public class ApplicationConfiguration {
    
}
