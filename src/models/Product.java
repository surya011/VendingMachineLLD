package models;
import models.ProductType;

public class Product {
    private String name;
    private double price;
    private ProductType type;

    public Product(String name, double price, ProductType type)
    {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public String getName(){
        return name;
    }

    public double price(){
        return price;
    }

    public ProductType getType(){
        return type;
    }
}
