package com.example.tuan4.model;

public class Product {
    private String moTa ;
    private String name;
    private int image;

    public String getMoTa() {
        return moTa;
    }

    public void setId(String moTa) {
        this.moTa = moTa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public Product( String name,String moTa, int image) {
        this.name = name;
        this.moTa = moTa;
        this.image = image;
    }

    @Override
    public String toString() {
        return "Product{" +
                "moTa=" + moTa +
                ", name='" + name + '\'' +
                ", image=" + image +
                '}';
    }
}
