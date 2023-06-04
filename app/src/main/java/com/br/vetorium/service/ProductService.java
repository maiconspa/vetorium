package com.br.vetorium.service;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

    public String getProductName(String id) {
        return "getProductName id: " +id;
    }
}
