package com.br.vetorium.service;

import com.br.vetorium.dto.ProductDto;
import com.br.vetorium.enums.Source;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ProductService {


    public String getAll() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        ProductDto test = new ProductDto();
        test.setTitle("title");
        test.setAffiliateUrl("http://test");
        test.setDescription("description");
        test.setSource(Source.Amazon);
        test.setImageUrls(List.of("link1", "link2"));
        test.setUpdateDate(LocalDate.now());

        return objectMapper.writeValueAsString(test);
    }
}
