package com.br.vetorium.entity;

import com.br.vetorium.enums.Source;
import com.br.vetorium.utils.Constants;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "source")
    private Source source;

    @Column(name = "affiliate_url")
    private String affiliateUrl;

    @Column(name = "image_urls")
    private List<String> imageUrls;

    @Column(name = "create_date")
    private LocalDateTime createDate;

    @Column(name = "update_date")
    private LocalDateTime updateDate;

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

    public static Boolean isValidDatePattern(String dateString) {
        Pattern regex = Pattern.compile(Constants.STRING_DATE_MATCHER);
        Matcher matcher = regex.matcher(dateString);

        return matcher.matches();
    }

    public static String formatDateToString(LocalDateTime localDate) throws DateTimeParseException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(Constants.STRING_DATE_FORMATTER);
        String formattedDate = localDate.format(formatter);

        if (isValidDatePattern(formattedDate))
            return formattedDate;
        else
            throw new DateTimeParseException("Invalid date-time format", formattedDate, 0);
    }
}