package com.br.vetorium.controller;

import com.br.vetorium.service.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    ProductService service;

    @GetMapping("/{id}")
    public String getProductNameById(@PathVariable("id") String id) {
        return service.getProductName(id);
    }
}
