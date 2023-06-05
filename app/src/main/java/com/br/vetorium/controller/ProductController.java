package com.br.vetorium.controller;

import com.br.vetorium.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vetorium")
public class ProductController {

    ProductService service = new ProductService();
    @GetMapping("/getAll")
    public ResponseEntity<String> getAll() {
        try {
           return ResponseEntity.ok(service.getAll());
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }
}
