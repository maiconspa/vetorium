package com.br.vetorium.entity;

import com.br.vetorium.enums.Source;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;
import java.util.Objects;

import static org.springframework.data.util.ProxyUtils.getUserClass;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "title")
    String title;

    @Column(name = "description")
    String description;

    @Column(name = "source")
    Source source;

    @Column(name = "affiliate_url")
    String affiliate_url;

    @Column(name = "images_url")
    List<String> images_urls;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getUserClass(this) != getUserClass(o))
            return false;
        Product product = (Product) o;
        return getId() != null && Objects.equals(getId(), product.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}