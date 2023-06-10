package com.br.vetorium.dto;

import com.br.vetorium.enums.Source;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import javax.validation.constraints.Pattern;
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
    private String createDate;
    private String updateDate;
}
