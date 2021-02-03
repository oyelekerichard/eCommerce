/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.ecommerce.controller;

import com.test.ecommerce.dao.UserDao;
import com.test.ecommerce.domainobject.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author PodeumINC
 */
@RestController
@RequestMapping("/ecommerce/users")
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(method = RequestMethod.GET, value = "/getAllUsers")
    public List<User> getAllUsers() {
        return userDao.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getUserByUsername/{username}")
    public User get(@PathVariable("username") String username) {
        return userDao.findById(username).get();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/createUser")
    public User createUser(@RequestBody final User user) {
        userDao.save(user);
        return userDao.findById(user.getUsername()).get();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/deleteUser")
    public List<User> delete(@PathVariable String username) {
        userDao.deleteById(username);
        return userDao.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/updateUser/{username}")
    public List<User> updateUser(@PathVariable String username, @RequestBody User user) {
        if (userDao.existsById(username)) {
            userDao.deleteById(username);
            userDao.save(user);
        }

        return userDao.findAll();
    }
}