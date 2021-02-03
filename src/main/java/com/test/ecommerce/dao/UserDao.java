/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.ecommerce.dao;

import com.test.ecommerce.domainobject.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author PodeumINC
 */
public interface UserDao extends JpaRepository<User, String> {
    
}
