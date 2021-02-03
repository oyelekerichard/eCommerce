/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.ecommerce.controller;

import com.test.ecommerce.domainobject.Products;
import com.test.ecommerce.service.ProductService;
import java.util.List;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author PodeumINC
 */
@RequestMapping("ecommerce")
@RestController
public class ProductController {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/getAllProducts")
    public List<Products> getAllProducts() {
        return productService.getAllProducts();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getProductById")
    public Products get(@RequestParam("productId") int productId) {
        return productService.getProductByProductId(productId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/createProduct")
    public List<Products> createProduct(@RequestBody Products products) {

        return productService.createProduct(products);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/deleteProduct")
    public List<Products> delete(@PathVariable int productId) {

        return productService.deleteProduct(productId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/updateProductWithId/{productId}")
    public List<Products> updateProduct(@PathVariable int productId, @RequestBody Products products) {
        
        return productService.updateProductByProductId(productId, products);
    }
}
