package com.codegym.model;

import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class ProductForm {
    private Long id;

    @NotEmpty
    @Size(min = 2, max = 30)
    @Pattern(regexp="^[A-Za-z]*$", message = "String must A-Za-z")
    private String name;

    private Double price;
    private MultipartFile image;

    public ProductForm() {
    }

    public ProductForm(Long id, String name, Double price, MultipartFile image) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }
}
