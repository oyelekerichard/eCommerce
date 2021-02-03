/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.ecommerce.service;

import com.test.ecommerce.dao.ProductsDao;
import com.test.ecommerce.domainobject.Products;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author PodeumINC
 */
@Service
public class ProductService {
    
    private static Logger logger = LoggerFactory.getLogger(ProductService.class);
    
    @Autowired
    private ProductsDao productDao;
    
    public List<Products> getAllProducts() {
        logger.info("Inside getAllProducts Method");
        return productDao.findAll();
    }


    public Products getProductByProductId(int productId) {
        return productDao.findById(productId).get();
    }

    public List<Products> createProduct(Products products) {
        productDao.save(products);
        return productDao.findAll();
    }

    public List<Products> deleteProduct(int productId) {
        productDao.deleteById(productId);
        return productDao.findAll();
    }

    public List<Products> updateProductByProductId(int productId, Products products) {
        if (productDao.existsById(productId)) 
        {
            productDao.deleteById(productId);
            productDao.save(products);
        }

        return productDao.findAll();
    }
    
}
