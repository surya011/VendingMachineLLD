package models;

import java.util.HashMap;

public class VendingMachine {
    static HashMap<String,Product> products = new HashMap<>();
    static HashMap<String, Integer> stock = new HashMap<>();

    public static void addProduct(String code, String name, double price, ProductType type, int quantity){
        Product product = new Product(name,price,type);
        products.put(code ,product);
        stock.put(code,quantity);
    }

    public static void removeProduct(String code){
        products.remove(code);
        stock.remove(code);
    }
    public int getStock(String code){
        Integer quantity = stock.get(code);
        return quantity != null ? quantity : 0;
    }

    public static HashMap<String,Product>getProducts(){
        return products;
    }


    public static boolean purchaseProduct(String code,int quantity){

        if(stock.containsKey(code) && stock.get(code) >0)
        {
            if(stock.get(code) >= quantity) {
                stock.put(code, stock.get(code) - quantity);
                return true;
            }
           else
            {
                System.out.println("Enough quantity of Product not available");
                return false;
            }
        }
        return false;

    }


}
