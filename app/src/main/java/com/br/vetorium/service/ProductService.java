package com.br.vetorium.service;

import com.br.vetorium.dto.ProductDto;
import com.br.vetorium.entity.Product;
import com.br.vetorium.enums.Source;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ProductService {
//    private ProductRepository repository;

    public String getAll() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String currentDateTime = Product.formatDateToString(LocalDateTime.now());

        ProductDto test = new ProductDto();
        test.setTitle("title");
        test.setAffiliateUrl("http://test");
        test.setDescription("description");
        test.setSource(Source.Amazon);
        test.setImageUrls(List.of("link1", "link2"));
        test.setCreateDate(currentDateTime);
        test.setUpdateDate(currentDateTime);

//        repository.save(test);
        return objectMapper.writeValueAsString(test);
    }
}
