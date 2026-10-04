package com.example.binding;


import jakarta.validation.constraints.NotNull;

public class Product {

    @NotNull(message="Id is required")
    private Integer pid;

    @NotNull(message="Name is required")
    private String name;

    @NotNull(message="Price is required")
    private Double price;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
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

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
