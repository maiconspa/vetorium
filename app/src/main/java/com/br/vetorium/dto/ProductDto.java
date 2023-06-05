package com.br.vetorium.dto;

import com.br.vetorium.enums.Source;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class ProductDto implements Serializable {
    private String title;
    private String description;
    private Source source;
    private String affiliateUrl;
    private List<String> imageUrls;
    private LocalDate updateDate;
}
